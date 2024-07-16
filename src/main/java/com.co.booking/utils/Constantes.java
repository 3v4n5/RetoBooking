package com.co.booking.utils;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import org.apache.commons.configuration2.EnvironmentConfiguration;

import static net.serenitybdd.core.Serenity.*;

public class Constantes {

    public static final String BASE_URL = EnvironmentSpecificConfiguration.from(environmentVariables())
            .getProperty("environments.default.webdriver.base.url");
    public static final String URL = EnvironmentSpecificConfiguration.from(environmentVariables())
            .getProperty("environments.search.webdriver.base.url");

    public static final String USER = EnvironmentSpecificConfiguration.from(environmentVariables())
            .getProperty("environments.credentials.webdriver.credentials.user");
    public static final String PASS = EnvironmentSpecificConfiguration.from(environmentVariables())
            .getProperty("environments.credentials.webdriver.credentials.pass");
}
