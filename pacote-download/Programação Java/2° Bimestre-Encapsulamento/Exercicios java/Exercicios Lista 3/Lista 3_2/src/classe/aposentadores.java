
package classe;

import javax.swing.JOptionPane;


public class aposentadores {
    protected String nome;
    protected int mes;
    protected int tempo;
    protected float valor_atual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        if((mes > 0)&&(mes <13)){
        this.mes = mes;
        return(true);
        }else{
             JOptionPane.showMessageDialog(null, "Mes invalido!");
             return(false);
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public float getValor_atual() {
        return valor_atual;
    }

    public void setValor_atual(float valor_atual) {
        this.valor_atual = valor_atual;
    }
    
    public float Aumento(){
        if (tempo<=5){
            return(float) (valor_atual*4.5/100);
        }else if (tempo<=8){
            return(valor_atual*5/100);
        }else if (tempo<=12){
            return(float) (valor_atual*5.5/100);
        }else{
            return(valor_atual*6/100);
        }
    }
    
    public float valor_final(){
        return(Aumento()+valor_atual);
    }
}
