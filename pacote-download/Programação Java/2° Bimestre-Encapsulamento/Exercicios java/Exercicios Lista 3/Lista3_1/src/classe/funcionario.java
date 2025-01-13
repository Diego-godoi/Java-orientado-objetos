
package classe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class funcionario {
    protected String nome;
    private Date adimissao;
    protected float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
            JOptionPane.showMessageDialog(null, "Data Invalida");
            return(false);
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public int Tempo(Date dtAtual){
        int tempo, diaN, mesN,anoN,diaH,mesH,anoH;
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
        else
            if(mesH==mesN)
                if(diaH<diaN)
                    tempo--;
        return(tempo);
    }
    
    public float Premio(){
        if(Tempo()<5){
            return(float) (salario*4.5/100);
        }else if(Tempo()<8){
            return(float) (salario*8.5/100);
        }else if(Tempo()<12){
            return(float) (salario*12.5/100);
        }else{
            return(float) (salario*16.5/100);
        }
    }
}
