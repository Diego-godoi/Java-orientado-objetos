package lista1_03;

import classe.Funcionario;
import java.util.Scanner;


public class Lista1_03 {
    static int x;
    static char op;
    static Scanner ler = new Scanner(System.in);
    static Funcionario fun[] = new Funcionario[5];
    
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
        System.out.println("Gratificação de 6 funcionarios");
        for(x=0;x<6;x++){
            fun[x]= new Funcionario();
            System.out.println("Nome do"+(x+1)+"º funcionario: ");
            fun[x].nome = ler.nextLine();
            System.out.println("Salario: ");
            fun[x].salario = ler.nextFloat();
            System.out.println("Quantidade de queijo produzido: ");
            fun[x].quantidade = ler.nextInt();
            System.out.println("Peso do queijo: ");
            fun[x].peso = ler.nextFloat();
            ler.nextLine();
        }
    }
    
    static void Listar(){
        System.out.println("Relacao dos funcionarios");
        System.out.println("Nome/t/tQuantidade/t/tSalario/t/tPremio/t/tValor Total");
        for(x=0;x<6;x++){
            System.out.print(fun[x].nome+"/t/t");
            System.out.print(fun[x].quantidade+"/t/t");
            System.out.print(fun[x].salario+"/t/t");
            System.out.print(fun[x].Gratificacao()+"/t/t");
            System.out.print((fun[x].Gratificacao()+fun[x].salario)+"");
        }
    }
}
