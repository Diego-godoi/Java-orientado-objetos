
package classe;

import javax.swing.JOptionPane;


public class Clientes {
    private String nome;
    private char sexo;
    private int tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public boolean setSexo(char sexo) {
        if ((sexo=='M')||(sexo=='F')){
            this.sexo = sexo;
            return(true);
        }else{
            JOptionPane.showMessageDialog(null, "Sexo invalido!");
            return(false);
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
    public float Mensalidade(){
        if (tempo<=6)
            return(float) (80.00);
        else 
        if(tempo<=10)
            if(sexo=='M')
                return(float) (80-80*5.00/100);
            else
                return(float) (80-80*5.50/100);
        else 
        if(tempo<=14)
            if(sexo=='M')
                return(float) (80-80*7.50/100);
            else
                return(float) (80-80*8.00/100);
        else
            if(sexo=='M')
                return(float) (80-80*10.00/100);
            else
                return(float) (80-80*11.00/100);
    }
    
}
