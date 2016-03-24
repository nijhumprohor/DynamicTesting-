/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruhul
 */
public class DynamicJUnitTest {
    private static final double DELTA = 1e-7;
    private DynamicTest test = new DynamicTest();
    public DynamicJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test1() {
        assertEquals(5.6, test.Tax(60,1,false), DELTA); 
    }
    @Test
    public void test2() {
        assertEquals(1.4, test.Tax(20,1,true), DELTA); 
    }
    @Test
    public void test3() {
        assertEquals(25.9, test.Tax(230,5,true), DELTA); 
    }
    @Test
    public void test4() {
        assertEquals(2.0, test.Tax(30,4,false), DELTA); 
    }
    @Test
    public void test5() {
        assertEquals(17.6, test.Tax(150,2,false), DELTA); 
    }
}
