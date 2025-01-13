/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author 20231INFO0230
 */
public class Taxistas extends Pessoa {
    private float semana;

    public float getSemana() {
        return semana;
    }

    public void setSemana(float semana) {
        this.semana = semana;
    }
    
    public float TaxaManutenção(){
        if(semana<=500)
            return(float) (semana*3.0/100);
        else if(semana<=650)
            return(float) (semana*3.5/100);
        else if(semana<=850/100)
            return(float) (semana*4.0/100);
        else 
            return(float) (semana*4.5/100);
    }
}
