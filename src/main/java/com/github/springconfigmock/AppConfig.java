package com.github.springconfigmock;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.github.springconfigmock.adder.AdderConfig;
import com.github.springconfigmock.substractor.SubstractorConfig;

/**
 * <p>AppConfig.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Configuration
@Import(value = {AdderConfig.class, SubstractorConfig.class})
public class AppConfig {

    /**
     * Constructor.
     *
     */
    public AppConfig() {
        //
    }

}
