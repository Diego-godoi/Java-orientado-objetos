
package classes;


public class Funcionario extends Pessoa {
    private int tempo;
    private float salario;

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    
    public float Aumento(){
        if(tempo<=5)
            return(float) (salario+(salario*6.5/100));
        else if(tempo<=8)
            return(float) (salario+(salario*7.8/100));
        else
            return(float) (salario+(salario*9.0/100));
    }
}
