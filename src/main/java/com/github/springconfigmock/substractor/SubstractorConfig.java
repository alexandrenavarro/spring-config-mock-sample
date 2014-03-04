package com.github.springconfigmock.substractor;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.github.springconfigmock.substractor.impl.SubstractorImplConfig;

/**
 * <p>SubstractConfig.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
@Configuration
@Import(value = {SubstractorImplConfig.class})
public class SubstractorConfig {

    /**
     * Constructor.
     *
     */
    public SubstractorConfig() {
        // TODO Auto-generated constructor stub

    }

}
