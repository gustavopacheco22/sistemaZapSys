/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaLogin;

import javaapp.validaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class validacionesTest {
    
    public validacionesTest() {
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

    /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testEmpty() {
        System.out.println("isEmpty");
        String n = "";
        boolean expResult = true;
        boolean result = validaciones.isEmpty(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testEmpty2() {
        System.out.println("isEmpty");
        String n = "dsd";
        boolean expResult = false;
        boolean result = validaciones.isEmpty(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testNumber() {
        System.out.println("isNumber");
        String n = "8";
        boolean expResult = true;
        boolean result = validaciones.isNumber(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testNumber2() {
        System.out.println("isntNumber");
        String n = "number";
        boolean expResult = false;
        boolean result = validaciones.isNumber(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testNumber3() {
        System.out.println("isntNumber");
        String n = "";
        boolean expResult = false;
        boolean result = validaciones.isNumber(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString() {
        System.out.println("isString");
        String n = "string";
        boolean expResult = true;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString2() {
        System.out.println("isntString");
        String n = "";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString3() {
        System.out.println("isntString");
        String n = "!";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString4() {
        System.out.println("isntString");
        String n = "#";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString5() {
        System.out.println("isntString");
        String n = "$";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString6() {
        System.out.println("isntString");
        String n = "$";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString7() {
        System.out.println("isntString");
        String n = "%";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
       /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString8() {
        System.out.println("isntString");
        String n = "&";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
       /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString9() {
        System.out.println("isntString");
        String n = "*";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
   
    
      /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString11() {
        System.out.println("isntString");
        String n = "/";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString12() {
        System.out.println("isntString");
        String n = "=";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString13() {
        System.out.println("isntString");
        String n = "?";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString14() {
        System.out.println("isntString");
        String n = "¡";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testString15() {
        System.out.println("isntString");
        String n = "55666";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
     /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testFloat() {
        System.out.println("isFloat");
        String n = "25626.113";
        boolean expResult = true;
        boolean result = validaciones.isFloat(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testFloat2() {
        System.out.println("isntFloat");
        String n = "float";
        boolean expResult = false;
        boolean result = validaciones.isFloat(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testFloat3() {
        System.out.println("isntFloat");
        String n = "";
        boolean expResult = false;
        boolean result = validaciones.isFloat(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testFloat4() {
        System.out.println("isntFloat");
        String n = " ";
        boolean expResult = false;
        boolean result = validaciones.isFloat(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of holders method, of class frm_alta.
     */
    @Test
    public void testMail1() {
        System.out.println("isMail");
        String n = "asd@gmail.com";
        boolean expResult = true;
        boolean result = validaciones.isEmail(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    
   
    
    
   
    
}
