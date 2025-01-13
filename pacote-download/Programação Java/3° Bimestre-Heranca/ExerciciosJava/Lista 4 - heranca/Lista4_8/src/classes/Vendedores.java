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
public class Vendedores extends Pessoa{
    private Date nasc;
    private float valor;

    public Date getNasc() {
        return nasc;
    }

    public boolean setNasc(String nasc) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try{
            this.nasc = df.parse(nasc);
            return(true);
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Data invalida");
            return(false);
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public int Idade(Date dtAtual){
        int idade,diaN,mesN,anoN,diaH,mesH,anoH;
        Calendar cal = Calendar.getInstance();
        
        cal.setTime(dtAtual);
        diaH = cal.get(Calendar.DAY_OF_MONTH);
        mesH = cal.get(Calendar.MONTH);
        anoH = cal.get(Calendar.YEAR);
        
        cal.setTime(nasc);
        diaN = cal.get(Calendar.DAY_OF_MONTH);
        mesN = cal.get(Calendar.MONTH);
        anoN = cal.get(Calendar.YEAR);
        
        idade= anoH - anoN;
        if(mesH<mesN)
            idade--;
        else if(mesH==mesN)
            if(diaH<diaN)
                idade--;
        return(idade);
    }
    
    public float Gratificacao(int idade){
        if(idade<=40)
            if(valor<=5000)
                return(float) (valor*3.5/100);
            else
                return(float) (valor*4.5/100);
        else
            if(valor<=7000)
                return(float) (valor*5.5/100);
            else
                return(float) (valor*6.5/100);
    }
}
