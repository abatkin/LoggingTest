package net.batkin.test;

import net.logstash.logback.composite.loggingevent.LoggingEventJsonProviders;

public class ExtendedLoggingEventJsonProviders extends LoggingEventJsonProviders {

	public void addArgsArray(ArgsArrayJsonProvider provider) {
		addProvider(provider);
	}
}
