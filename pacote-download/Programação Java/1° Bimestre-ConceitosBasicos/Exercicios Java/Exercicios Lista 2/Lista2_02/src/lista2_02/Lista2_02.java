package lista2_02;

import classe.Vendedores;
import java.util.Scanner;


public class Lista2_02 {
    static int x,y;
    static char op;
    static Scanner ler=new Scanner(System.in);
    static Vendedores vend[]=new Vendedores[4];
    
    public static void main(String[] args) {
        do{
            Digitar();
            Listar();
            do{
                System.out.println("Sair?9s/n): ");
                op = Character.toUpperCase(ler.next().charAt(0));
            }while((op!='S')&&(op!='N'));
        }while(op!='S');
    }
    
    static void Digitar(){
        System.out.println("Calculo da comissao semanal dos vendedores");
        for(x=0;x<5;x++){
            vend[x]=new Vendedores();
            System.out.println("Nome do "+(x+1)+"° vendedor: ");
            vend[x].nome =ler.nextLine();
            for(y=0;y<5;y++){
                System.out.println("Vendas do "+(y+1)+"° dia da semana: ");
                vend[x].vendas[y]= ler.nextFloat();
            }
            ler.nextLine();
        }
        
    }
    
    static void Listar(){
        System.out.println("Relacao dos Vendedores");
        System.out.println("Nome\t\tValor total vendido\t\tValor da comissao semanal");
        for(x=0;x<5;x++){
            System.out.print(vend[x].nome+"\t\t");
            System.out.print(vend[x].TotalVendido()+"\t\t");
            System.out.print(vend[x].ComissaoSemanal());
        }
    }
}
