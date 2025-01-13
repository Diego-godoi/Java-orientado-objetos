
package classe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class Pessoa {
    private String nome;
    private Date nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

//    Definir o formato da Data e testar se é valido
    public boolean setNascimento(String nascimento) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try{
            this.nascimento = df.parse(nascimento);
            return(true);
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Data Invalida");
            return(false);
        }
    }
    
    public int Idade(Date dtAtual){
//        Variaveis
        int idade,diaN,mesN,anoN,diaH,mesH,anoH;
        Calendar cal = Calendar.getInstance();
        
//        Definindo o dia, mes e ano atual
        cal.setTime(dtAtual);
        diaH = cal.get(Calendar.DAY_OF_MONTH);
        mesH  =cal.get(Calendar.MONTH);
        anoH = cal.get(Calendar.YEAR);
        
//        Definindo dia, mes e ano do nascimento
        cal.setTime(nascimento);
        diaN = cal.get(Calendar.DAY_OF_MONTH);
        mesN  =cal.get(Calendar.MONTH);
        anoN = cal.get(Calendar.YEAR);
        
//        Calculo da idade
        idade = anoH - anoN;
        if(mesH <mesN)
            idade--;
        else
            if(mesH == mesN)
                if(diaH<diaN)
                    idade--;
        return(idade);
    }
}