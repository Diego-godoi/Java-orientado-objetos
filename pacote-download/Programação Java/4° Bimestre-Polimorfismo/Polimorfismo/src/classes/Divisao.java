/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Divisao extends Calculadora{
    @Override
    public float Calcular(float x, float y){
        if(y!=0){
            return(x/y);
        }else{
            JOptionPane.showMessageDialog(null, "divisao indefinida");
            return(0);
        }
    }
}
