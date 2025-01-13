
package classe;


public class Funcionario {
    public String nome;
    public int tempo;
    public float salario;
    
    public float aumento(){
        if (tempo<=4)
            return(float)(salario*6.5/100);
        else if(tempo<=8)
            return(float)(salario*8.5/100);
        else 
            return(salario*10/100);
    }
}
