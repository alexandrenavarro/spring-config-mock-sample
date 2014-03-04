package com.github.springconfigmock.substractor.impl;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.springconfigmock.AppConfig;
import com.github.springconfigmock.adder.Adder;
import com.github.springconfigmock.adder.impl.AdderImplConfigForTests;
import com.github.springconfigmock.substractor.Substractor;

/**
 * <p>DefaultSubstractorTest.</p>
 *
 * @author anavarro - Mar 4, 2014
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ActiveProfiles("mock")
@ContextHierarchy({
    @ContextConfiguration(name = "parent", classes = {AppConfig.class})
    ,@ContextConfiguration(name = "child", classes = {AdderImplConfigForTests.class})
    
})
public class DefaultSubstractorTest {
    
    @Inject
    private Substractor substractor; 
    
    @Inject
    //@Mock
    private Adder adder; 

   
    /**
     * <p>init.</p>
     *
     */
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        //Mockito.when(adder.add(1.0, 1.0)).thenReturn(2.0);
    }
    

    /**
     * Test method for {@link com.github.springconfigmock.substractor.impl.DefaultSubstractor#substract(double, double)}.
     */
//    @Test
//    public void testSubstract() {
//        
//        Assert.assertTrue(this.substractor.substract(1, 1) == 0);
//        
//    }
    
    /**
     * <p>testAdd.</p>
     *
     */
    @Test
    public void testAdd() {
        
        Assert.assertTrue(this.adder.add(1, 1) == 2);
        
    }

}
