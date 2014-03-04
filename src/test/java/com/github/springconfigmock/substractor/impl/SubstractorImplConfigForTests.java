package com.github.springconfigmock.substractor.impl;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.github.springconfigmock.adder.Adder;
import com.github.springconfigmock.adder.impl.AdderImplConfigForTests;

/**
 * <p>AdderImplConfigForTests.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Configuration
@Import(value = {AdderImplConfigForTests.class, SubstractorImplConfig.class})
public class SubstractorImplConfigForTests {

    @Inject
    private Adder adder;
    /**
     * Constructor.
     *
     */
    public SubstractorImplConfigForTests() {
    }
    
}
