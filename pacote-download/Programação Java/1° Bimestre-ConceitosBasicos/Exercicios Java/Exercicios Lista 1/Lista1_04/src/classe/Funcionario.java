
package classe;


public class Funcionario {
    public String nome;
    public int tempo;
    public int idade;
    public float salario;
    
    public float premio(){
        if (tempo<=5)
            if(idade<=25)
                return(salario*5/100);
            else if(idade<=30)
                return(salario*6/100);
            else 
                return(salario*7/100);
        else
            if(idade<=30)
                return(float)(salario*6.5/100);
            else if(idade<=40)
                return(salario*8/100);
            else
                return(float)(salario*9.5/100);
    }
}
