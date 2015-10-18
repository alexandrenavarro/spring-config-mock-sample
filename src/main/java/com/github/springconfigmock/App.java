package com.github.springconfigmock;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.springconfigmock.adder.Adder;
import com.github.springconfigmock.substractor.Substractor;

/**
 * <p>App.</p>
 *
 * @author anavarro - Mar 3, 2014
 *
 */
public class App {

    
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    
    /**
     * Constructor.
     *
     */
    public App() {
    }
    
    /**
     * <p>main.</p>
     *
     * @param args
     */
    public static void main(String[] args) {

        final ApplicationContext context = 
        new AnnotationConfigApplicationContext(AppConfig.class);
        Map<String, String> map = (Map<String, String>) context.getBean("map");
        LOGGER.info("map={}", map);
        
        final Adder adder = context.getBean(Adder.class);
        final Substractor substractor = context.getBean(Substractor.class);
        LOGGER.info ("1 - 1 = " + substractor.substract(1, 1));
        LOGGER.info ("1 + 1 = " + adder.add(1, 1));
        
        List<String> list = (List<String>) context.getBean("list");
        LOGGER.info("list={}", list);
    }

}
