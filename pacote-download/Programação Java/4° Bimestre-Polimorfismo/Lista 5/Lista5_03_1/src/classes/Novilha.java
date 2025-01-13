/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public class Novilha extends Animal{

    @Override
    public float adicional() {
        if(pesoTotal()<=500)
            return (float) (valorBasico()*2.5/100);
        else if(pesoTotal()<=800)
            return (float) (valorBasico()*3.5/100);
        else 
            return (float) (valorBasico()*4.5/100);
    }

    
    
}
