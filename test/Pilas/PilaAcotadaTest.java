/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class PilaAcotadaTest {
    
  
   
    public PilaAcotadaTest() {
    }
    
    @BeforeClass
    //Permite hacer aquello que quiera hacer en todos los test
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

    
    @Test
    public void testesVaciaInicial() {
        PilaAcotada pila = new PilaAcotada();
        assertEquals(true, pila.estaVacia());
        
    }
    @Test
    public void testesDespuesdeApilar() {
        PilaAcotada pila = new PilaAcotada();
        pila.apilar(1);
        assertEquals(false, pila.estaVacia());
        
    }
    @Test
       public void testesDespuesdeApilaryDesapilar() {
        PilaAcotada pila = new PilaAcotada();
        pila.apilar(1);
        pila.desapilar();
        assertEquals(true, pila.estaVacia());
        
    }
    @Test
       public void testestaLlenoPilaInicial() {
           PilaAcotada pila = new PilaAcotada();
           assertEquals(false, pila.estallena());
       }
}
