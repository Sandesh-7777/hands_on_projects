package com.cognizant.Spring_Core_Load_Country_from_Spring_Configuration_XML;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreLoadCountryFromSpringConfigurationXmlApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringCoreLoadCountryFromSpringConfigurationXmlApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringCoreLoadCountryFromSpringConfigurationXmlApplication.class, args);

        displayCountry();
    }

    public static void displayCountry() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country =
                context.getBean("country", Country.class);

        System.out.println(country);
 
        LOGGER.info("END");
    }
}