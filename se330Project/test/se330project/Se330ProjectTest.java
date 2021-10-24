/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project;

import javafx.stage.Stage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jrrou
 */
public class Se330ProjectTest {
    
    public Se330ProjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of start method, of class Se330Project.
     */
//    @Test
//    public void testStart() {
//        System.out.println("start");
//        Stage primaryStage = null;
//        Se330Project instance = new Se330Project();
//        instance.start(primaryStage);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of addNums method, of class Se330Project.
     */
//    @Test
//    public void testAddNums() {
//        System.out.println("addNums");
//        int a = 0;
//        int b = 0;
//        int expResult = 0;
//        int result = Se330Project.addNums(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testAddNums(){
        System.out.println("addNums");
        int expectedResult = 4;
        assertEquals(expectedResult, Se330Project.addNums(2,2));
        assertNotEquals(expectedResult, Se330Project.addNums(10,2));
    }

    /**
     * Test of start method, of class Se330Project.
     */
//    @Test
//    public void testStart() {
//        System.out.println("start");
//        Stage primaryStage = null;
//        Se330Project instance = new Se330Project();
//        instance.start(primaryStage);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of aWord method, of class Se330Project.
//     */
//    @Test
//    public void testAWord() {
//        System.out.println("aWord");
//        String word = "";
//        Se330Project instance = new Se330Project();
//        Boolean expResult = false;
//        Boolean result = instance.aWord(word);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of start method, of class Se330Project.
     */
//    @Test
//    public void testStart() {
//        System.out.println("start");
//        Stage primaryStage = null;
//        Se330Project instance = new Se330Project();
//        instance.start(primaryStage);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getType method, of class Se330Project.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Se330Project instance = new Se330Project();
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of start method, of class Se330Project.
//     */
//    @Test
//    public void testStart() {
//        System.out.println("start");
//        Stage primaryStage = null;
//        Se330Project instance = new Se330Project();
//        instance.start(primaryStage);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of aWord method, of class Se330Project.
//     */
//    @Test
//    public void testAWord() {
//        System.out.println("aWord");
//        String word = "";
//        Se330Project instance = new Se330Project();
//        Boolean expResult = null;
//        Boolean result = instance.aWord(word);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getEquip method, of class Se330Project.
     */
    @Test
    public void testGetEquip() {
        System.out.println("getEquip");
        Se330Project instance = new Se330Project();
        int expResult = 0;
        int result = instance.getEquip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of start method, of class Se330Project.
     */
//    @Test
//    public void testStart() {
//        System.out.println("start");
//        Stage primaryStage = null;
//        Se330Project instance = new Se330Project();
//        instance.start(primaryStage);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of aWord method, of class Se330Project.
     */
    @Test
    public void testAWord() {
        System.out.println("aWord");
        String word = "";
        Se330Project instance = new Se330Project();
        Boolean expResult = false;
        Boolean result = instance.aWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTime method, of class Se330Project.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Se330Project instance = new Se330Project();
        int expResult = 0;
        int result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class Se330Project.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Se330Project.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class Se330Project.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Se330Project.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class Se330Project.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Se330Project.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class Se330Project.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Se330Project.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    

    /**
     * Test of main method, of class Se330Project.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Se330Project.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
