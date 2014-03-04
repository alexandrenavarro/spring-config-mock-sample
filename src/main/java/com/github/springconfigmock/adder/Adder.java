package com.github.springconfigmock.adder;

/**
 * <p>Adder.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
public interface Adder {

    /**
     * <p>add.</p>
     *
     * @param a1
     * @param a2
     * @return
     */
    public double add(final double a1, final double a2);

    public abstract void setImplementationName(String aImplementationName);

    public abstract String getImplementationName();
}
