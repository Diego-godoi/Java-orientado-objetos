/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Circulo extends Calculadora{
   @Override
   public float Calcular(float x,float y){
       return(float) (Math.PI*Math.pow(x, 2));
   }
}
