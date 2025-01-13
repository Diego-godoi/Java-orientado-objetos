/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Funcionarios extends Pessoa{
    private float salario;
    private Date adimissao;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getAdimissao() {
        return adimissao;
    }

    public boolean setAdimissao(String adimissao) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try{
            this.adimissao = df.parse(adimissao);
            return(true);
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Data invalida");
            return(false);
        }
    }
    
    public int Tempo(Date dtAtual){
        int tempo, diaN,mesN,anoN,diaH,mesH,anoH;
        Calendar cal = Calendar.getInstance();
        
        cal.setTime(dtAtual);
        diaH = cal.get(Calendar.DAY_OF_MONTH);
        mesH = cal.get(Calendar.MONTH);
        anoH = cal.get(Calendar.YEAR);
        
        cal.setTime(adimissao);
        diaN = cal.get(Calendar.DAY_OF_MONTH);
        mesN = cal.get(Calendar.MONTH);
        anoN = cal.get(Calendar.YEAR);
        
        tempo = anoH - anoN;
        if(mesH<mesN)
            tempo--;
        else if (mesH==mesN)
            if(diaH<diaN)
                tempo--;
        return(tempo);
    }
    
    public float Aumento(int tempo){
        if(tempo<=4)
            return(float) (salario+(salario*2.5/100));
        else if(tempo<=6)
            return(float) (salario+(salario*3.0/100));
        else if(tempo<=8)
            return(float) (salario+(salario*3.5/100));
        else 
            return(float) (salario+(salario*4.0/100));
    }
    

}
