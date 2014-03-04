package com.github.springconfigmock.adder;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.github.springconfigmock.adder.impl.AdderImplConfig;

/**
 * <p>AdderConfig.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Configuration
@Import(value = {AdderImplConfig.class})
public class AdderConfig {

    /**
     * Constructor.
     *
     */
    public AdderConfig() {
        //
    }

}
