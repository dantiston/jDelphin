package net.delphin.jdelphin.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("ContextProperties")
public final class JDelphinContextProperties {

	/** Singleton instance */
	private static final JDelphinContextProperties INSTANCE = new JDelphinContextProperties();

	private static final String DELIMITER = ":";

	/** Logger configuration name in Spring config file */
	private static final String LOGGER_KEY = "logger";
	/** Default logger name */
	private static final String LOGGER_DEFAULT = "info.log";

	public static final JDelphinContextProperties get() {
		return JDelphinContextProperties.INSTANCE;
	}

	@Value("${" + LOGGER_KEY + DELIMITER + LOGGER_DEFAULT + "}")
	private String logger;

	/**
	 * @return the configured logger
	 */
	public final String getLogger() {
		return this.logger;
	}
}
