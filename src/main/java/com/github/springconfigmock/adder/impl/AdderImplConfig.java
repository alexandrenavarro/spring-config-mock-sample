package com.github.springconfigmock.adder.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>AdderConfig.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Configuration
@ComponentScan(basePackageClasses = {AdderImplConfig.class})
public class AdderImplConfig {

    /**
     * Constructor.
     *
     */
    public AdderImplConfig() {
        // TODO Auto-generated constructor stub

    }

}
