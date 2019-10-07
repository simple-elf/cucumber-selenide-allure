package org.selenide.examples.cucumber;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

public class Hooks {

    @Before()
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = false;
        Configuration.reportsFolder = "target/surefire-reports";
        Configuration.screenshots = false;

        SelenideLogger.addListener("Allure Selenide", new AllureSelenide());
        System.out.println("--------------------setUp()------------------------");
    }

}
