package lista2_01;

import classe.Vendedores;
import java.util.Scanner;

public class Lista2_01 {
    //Variaveis
    static int x,y;
    static char op;
    static Scanner ler = new Scanner(System.in);
    static Vendedores vend[] = new Vendedores[5];
    
    public static void main(String[] args) {
        do{
            Digitar();
            Listar();
            do{
                System.out.println("Sair?(s/n): ");
                op = Character.toUpperCase(ler.next().charAt(0));
            }while((op!='S')&&(op!='N'));
        }while(op!='S');
    }
    
    static void Digitar(){
        System.out.println("Calculo das Ferias de 5 vendedores");
        for(x=0;x<5;x++){
            vend[x]=new Vendedores();
            System.out.println("Nome do"+(x+1)+"vendedor: ");
            vend[x].nome = ler.nextLine();
            for(y=0;y<3;y++){
                System.out.println("Salario do"+(y+1)+" mes: ");
                vend[x].salario[y] = ler.nextFloat();
            }
            ler.nextLine();
        }
    }
    
    static void Listar(){
        System.out.println("Relacao dos Vendedores");
        System.out.println("Nome\t\tSalario de ferias\t\tValor da Previdencia\t\tSalario Liquido");
        for(x=0;x<5;x++){
            System.out.print(vend[x].nome+"\t\t");
            System.out.print(vend[x].Ferias()+"\t\t");
            System.out.print(vend[x].Previdencia()+"\t\t");
            System.out.println(vend[x].Liquido());
        }
    }
    
}
    
    
 