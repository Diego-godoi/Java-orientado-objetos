package salario;

import classes.Funcionario;
import java.util.Scanner;

public class Salario {
    
    static Funcionario fun[] = new Funcionario[10];
    static Scanner ler = new Scanner(System.in);
    static int x;
    static char op;
    
    
    public static void main(String[] args) {
        do{
            Digitar();
            Listar();
            do{
                System.out.println("SAIR DO PROGRAMA? (S/N): ");
                op = Character.toUpperCase(ler.next().charAt(0));
            }while ((op!= 'S')&&(op!= 'N'));
        }while (op != 'S');
    }
    static void Digitar(){
        System.out.println("CADASTRO DE 10 CLIENTES");
        for (x=0; x<10;x++){
            fun[x]= new Funcionario();
            System.out.println("Nome do "+(x+1)+"° cliente: ");
            fun[x].nome = ler.nextLine();
            System.out.println("Salario: ");
            fun[x].salario = ler.nextFloat();
            ler.nextLine();
        }
            
    }
    static void Listar(){
        System.out.println("RELAÇÃO DE FUNCIONARIOS");
        System.out.println("NOME\t\tSALARIO\t\tNOVO SALARIO");
        for(x=0;x<10;x++){
            System.out.print(fun[x].nome+"\t\t");
            System.out.print(fun[x].salario+"\t\t");
            System.out.println(fun[x].CalculaAumento());
        }
    }
}
