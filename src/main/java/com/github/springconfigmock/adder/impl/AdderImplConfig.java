package com.github.springconfigmock.adder.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

import org.springframework.context.annotation.Bean;
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
