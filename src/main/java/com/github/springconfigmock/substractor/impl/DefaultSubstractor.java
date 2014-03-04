package com.github.springconfigmock.substractor.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.github.springconfigmock.adder.Adder;
import com.github.springconfigmock.substractor.Substractor;

/**
 * <p>DefaultSubstractor.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Named("substractor")
public class DefaultSubstractor implements Substractor {

    @Inject
    private Adder adder;
    
    /**
     * Constructor.
     *
     */
    public DefaultSubstractor() {
        // TODO Auto-generated constructor stub

    }
    
    
    /**
     * {@inheritDoc}
     *
     * @see com.github.springconfigmock.substractor.Substractor#substract(double, double)
     */
    @Override
    public double substract(final double a1, final double a2) {
        return this.adder.add(a1, -a2);
    }

}
