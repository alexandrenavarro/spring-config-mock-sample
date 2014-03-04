package com.github.springconfigmock.adder.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.springconfigmock.adder.Adder;

/**
 * <p>AdderConfig.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Configuration
//@ComponentScan(basePackageClasses = {AdderImplConfigForTests.class})
public class AdderImplConfigForTests {

    /**
     * Constructor.
     *
     */
    public AdderImplConfigForTests() {
        // TODO Auto-generated constructor stub

    }
    
    /**
     * <p>adder.</p>
     *
     * @return
     */
    @Bean Adder adder() {
        return new MockAdder();
    }

}
