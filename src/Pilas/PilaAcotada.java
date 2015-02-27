/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import Excepciones.ExcepcionDePilaLlena;
import Excepciones.ExcepcionDePilaVacia;

/**
 *
 * @author Usuario
 *
 * 1)Con el test 2)Ver fallar el test 3)Ver acertar el test 4)Creo otro test 5)Ejecuta test 6)
 */
public class PilaAcotada {

    protected int tamMax = 100, tam =0;
    protected Object[] array = new Object[tamMax];
    
    public boolean estaVacia() {
        return tam==0;
    }

    public void apilar(Object ob) throws ExcepcionDePilaLlena {
         if(tam==100){
            throw  new Excepciones.ExcepcionDePilaLlena("Esta pila esta vacia");
        }
        array[tam]=ob;
        tam++;
    }
    public void desapilar() throws ExcepcionDePilaVacia{
        if(tam==0){
            throw  new Excepciones.ExcepcionDePilaVacia("Esta pila esta vacia");
        }
        tam--;
    }
    public boolean estallena(){
        return tam==tamMax;
    }
    public int obtenerTamanno(){
        return tam;
    }
    public Object obtenercima(){
        return tam;
    }
    public Object cima() throws ExcepcionDePilaVacia{
        if(tam==0){
            throw  new Excepciones.ExcepcionDePilaVacia("Esta pila esta vacia");
        }
        return array[tam];
    }
    
}
