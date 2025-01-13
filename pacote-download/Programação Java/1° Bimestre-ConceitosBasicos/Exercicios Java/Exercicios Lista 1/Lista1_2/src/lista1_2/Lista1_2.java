
package lista1_2;

import classe.Funcionario;
import java.util.Scanner;


public class Lista1_2 {
    static int x;
    static char op;
    static Funcionario fun[] = new Funcionario[5];
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        do{
            Digitar();
            Listar();
            do{
                System.out.println("Sair?(S/N): ");
                op = Character.toUpperCase(ler.next().charAt(0));
            }while((op!='S')&&(op!='N'));
        }while(op!='S');
    }
    
    static void Digitar(){
        System.out.println("Aumento de 5 funcionarios");
        for(x=0;x<5;x++){
            fun[x] = new Funcionario();
            System.out.println("Nome do"+(x+1)+"º funcionario: ");
            fun[x].nome = ler.nextLine();
            System.out.println("Tempo de Serviço: ");
            fun[x].tempo = ler.nextInt();
            System.out.println("Salario: ");
            fun[x].salario = ler.nextFloat();
            ler.nextLine();
        }
    }
    
    static void Listar(){
        System.out.println("Relacao dos funcionarios");
        System.out.println("Nome/t/tTempo de Serviço/t/tNovo Salario");
        for(x=0;x<5;x++){
            System.out.print(fun[x].nome+"/t/t");
            System.out.print(fun[x].tempo+"/t/t");
            System.out.println(fun[x].aumento());
        }
    }
    
}
