package com.github.springconfigmock.adder.impl;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.springconfigmock.adder.Adder;

/**
 * <p>DefaultAdder.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Named("adder")
public class DefaultAdder implements Adder {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultAdder.class);

    private String implementationName = this.getClass().getSimpleName();
    
    /**
     * Constructor.
     *
     */
    public DefaultAdder() {
    }

    
    /**
     * <p>add.</p>
     *
     * @param a1
     * @param a2
     * @return
     */
    public double add(final double a1, final double a2) {
        LOGGER.debug(this.implementationName + ".add");
        return a1 + a2;
    }


    /**
     * Returns the implementationName.
     *
     * @return The implementationName to return.
     */
    @Override
    public String getImplementationName() {
        return this.implementationName;
    }


    /**
     * Sets the implementationName.
     *
     * @param aImplementationName The implementationName to set.
     */
    @Override
    public void setImplementationName(String aImplementationName) {
        this.implementationName = aImplementationName;
    }
    
    
}
