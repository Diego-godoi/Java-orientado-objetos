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
public class Cliente extends Pessoa{
    private char sexo;
    private Date nasc;

    public char getSexo() {
        return sexo;
    }

    public boolean setSexo(char sexo) {
        if((sexo=='B')||(sexo=='F')){
            this.sexo = sexo;
            return(true);
        }else{
            JOptionPane.showMessageDialog(null, "Sexo Inválido");
            return(false);
        }
    }

    public Date getNasc() {
        return nasc;
    }

    public boolean setNasc(String nasc) {
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try{
            this.nasc = df.parse(nasc);
            return(true);
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Data Invalida");
            return(false);
        }
    }
    
    public int Idade(Date dtAtual){ //calculo idade
    
        int idade,diaN,mesN,anoN,diaH,mesH,anoH;
        Calendar cal= Calendar.getInstance();
        
        cal.setTime(dtAtual);
        diaH = cal.get(Calendar.DAY_OF_MONTH);
        mesH = cal.get(Calendar.MONTH);
        anoH = cal.get(Calendar.YEAR);
        
        cal.setTime(nasc);
        diaN = cal.get(Calendar.DAY_OF_MONTH);
        mesN = cal.get(Calendar.MONTH);
        anoN = cal.get(Calendar.YEAR);
        
        idade = anoH-anoN;
        if(mesH<mesN)
            idade--;
        else if(mesH==mesN)
            if(diaH<diaN)
                idade--;
        return(idade);
    }
}
