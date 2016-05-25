package net.batkin.test;

import ch.qos.logback.classic.spi.ILoggingEvent;
import com.fasterxml.jackson.core.JsonGenerator;
import net.logstash.logback.composite.AbstractFieldJsonProvider;

import java.io.IOException;

public class ArgsArrayJsonProvider extends AbstractFieldJsonProvider<ILoggingEvent> {

	public static final String FIELD_NAME = "argsArray";

	public ArgsArrayJsonProvider() {
		setFieldName(FIELD_NAME);
	}

	@Override
	public void writeTo(JsonGenerator generator, ILoggingEvent iLoggingEvent) throws IOException {
		Object[] args = iLoggingEvent.getArgumentArray();
		if (args != null && args.length > 0) {
			generator.writeArrayFieldStart(getFieldName());
			for (Object arg : args) {
				generator.writeObject(arg);
			}
			generator.writeEndArray();
		}
	}


}
