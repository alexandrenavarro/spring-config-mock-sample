package com.github.springconfigmock.adder.impl;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;

import com.github.springconfigmock.adder.Adder;

/**
 * <p>MockAdder.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Named("adder")
@Profile("mock")
public class MockAdder implements Adder {

    private static final Logger LOGGER = LoggerFactory.getLogger(MockAdder.class);

    private String implementationName = this.getClass().getSimpleName();
    
    /**
     * Constructor.
     *
     */
    public MockAdder() {
        // TODO Auto-generated constructor stub

    }


    /**
     * {@inheritDoc}
     *
     * @see com.github.springconfigmock.adder.Adder#add(double, double)
     */
    @Override
    public final double add(final double aA1, final double aA2) {
        LOGGER.debug("MockAdder");
        return aA1 + aA2;
    }


    /**
     * {@inheritDoc}
     *
     * @see com.github.springconfigmock.adder.Adder#setImplementationName(java.lang.String)
     */
    public void setImplementationName(String aImplementationName) {
        this.implementationName = aImplementationName;
    }


    /**
     * {@inheritDoc}
     *
     * @see com.github.springconfigmock.adder.Adder#getImplementationName()
     */
    public String getImplementationName() {
        return this.implementationName;
    }

}
