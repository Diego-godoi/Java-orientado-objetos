/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public class Vaca extends Animal{
    @Override
    public float adicional() {
        if(pesoTotal()<=1200)
            return (float) (valorBasico()*1.5/100);
        else if(pesoTotal()<=1800)
            return (float) (valorBasico()*1.9/100);
        else 
            return (float) (valorBasico()*2.4/100);
    }

}
