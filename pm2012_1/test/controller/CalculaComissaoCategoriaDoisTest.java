/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Comissao;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author Taís
 */
public class CalculaComissaoCategoriaDoisTest {
    
    public CalculaComissaoCategoriaDoisTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CalculaComissao method, of class CalculaComissaoCategoriaDois.
     */
    @Test
    public void testCalculaComissao() {
        System.out.println("CalculaComissao");
        Comissao comissao = null;
        CalculaComissaoCategoriaDois instance = new CalculaComissaoCategoriaDois();
        instance.CalculaComissao(comissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
