package com.github.springconfigmock.substractor.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.github.springconfigmock.adder.AdderConfig;

/**
 * <p>SubstractorImplConfig.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Configuration
@ComponentScan(basePackageClasses = {SubstractorImplConfig.class})
@Import(value = {AdderConfig.class})
public class SubstractorImplConfig {

    /**
     * Constructor.
     *
     */
    public SubstractorImplConfig() {
        // TODO Auto-generated constructor stub

    }

}
