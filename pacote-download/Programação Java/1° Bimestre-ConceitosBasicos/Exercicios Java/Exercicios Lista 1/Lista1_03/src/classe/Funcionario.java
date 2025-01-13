
package classe;


public class Funcionario {
    public String nome;
    public float salario;
    public int quantidade;
    public float peso;
    
    public float Gratificacao(){
        if(salario<= 1500)
            if(pesototal()<=160)
                return(salario*1/100);
            else
                 return(salario*2/100);
        else
            if (pesototal()<=170)
                return(float) (salario*2.5/100);
            else
                return(float)(salario*3.5/100);
    }
    
    public float pesototal(){
        return(peso*quantidade);
    }
}
