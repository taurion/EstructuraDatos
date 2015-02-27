/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import Excepciones.ExcepcionDePilaLlena;
import Excepciones.ExcepcionDePilaVacia;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void testesDespuesdeApilar() throws ExcepcionDePilaLlena {
        PilaAcotada pila = new PilaAcotada();
        pila.apilar(1);
        assertEquals(false, pila.estaVacia());

    }

    @Test
    public void testesDespuesdeApilaryDesapilar() throws ExcepcionDePilaVacia, ExcepcionDePilaLlena {
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

    @Test
    public void testTamannoPilaInicial() throws ExcepcionDePilaLlena {
        PilaAcotada pila = new PilaAcotada();
        pila.apilar(1);
        pila.apilar("hola");
        assertEquals(2, pila.obtenerTamanno());
    }

    @Test
    public void testTop() throws ExcepcionDePilaLlena {
        PilaAcotada pila = new PilaAcotada();
        pila.apilar(1);
        assertEquals(1, pila.obtenercima());
    }

    @Test(expected = ExcepcionDePilaVacia.class)
    public void testDePilaVaciaDesapilar() throws ExcepcionDePilaVacia {
        PilaAcotada pila = new PilaAcotada();
        pila.desapilar();
    }

    @Test(expected = ExcepcionDePilaVacia.class)
    public void testDePilaVaciaTop() throws ExcepcionDePilaVacia {
        PilaAcotada pila = new PilaAcotada();
        pila.cima();
    }

    @Test(expected = ExcepcionDePilaLlena.class)
    public void testDePilaLlena() throws ExcepcionDePilaLlena {
        PilaAcotada pila = new PilaAcotada();
        for (int x = 1; x <= 101; x++) {
            pila.apilar(x);
        }
    }

    @Test
    public void testApilarDesapilarDejaLaPilaIgual() {
        try {
            PilaAcotada pila = new PilaAcotada();
            int cimaA = (int) pila.cima();
            pila.apilar(1);
            pila.desapilar();
            boolean iguales = cimaA == (int) pila.cima();
            assertEquals(true, iguales);
        } catch (ExcepcionDePilaLlena | ExcepcionDePilaVacia ex) {
            Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
     public void testDePilaLlenaPilaQueHellenado(){
        PilaAcotada pila = new PilaAcotada();
        for (int x = 1; x <= 101; x++) {
            try {
                pila.apilar(x);
            } catch (ExcepcionDePilaLlena ex) {
                Logger.getLogger(PilaAcotadaTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        assertEquals(true, pila.estallena());
    }
}
