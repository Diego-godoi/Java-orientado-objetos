package classes;


public class Funcionario {
    public String nome;
    public float salario;
    
    public float CalculaAumento(){
        return (salario+ salario*10/100);
    }
}
