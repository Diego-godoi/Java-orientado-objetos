
package lista2_03;

import classe.Garcom;
import java.util.Scanner;


public class Lista2_03 {
    static int x;
    static char op;
    static Scanner ler = new Scanner(System.in);
    static Garcom gar[] = new Garcom[2];
    
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
        System.out.println("Promoção de pizza");
        for(x=0;x<3;x++){
            gar[x]=new Garcom();
            System.out.println("Nome do"+(x+1)+"º garçom: ");
            gar[x].nome=ler.nextLine();
            System.out.println("Quantidade de pizzas de muçarela vendidas: ");
            gar[x].mucarela = ler.nextInt();
            do{
                System.out.println("Quantidade de pizzas de muçarela com bordas: ");
                gar[x].borda_mucarela = ler.nextInt();
            }while(gar[x].mucarela<gar[x].borda_mucarela);
            System.out.println("Quantidade de pizzas de presunto vendidas: ");
            gar[x].presunto = ler.nextInt();
            do{
                System.out.println("Quantidade de pizzas de presunto com bordas: ");
                gar[x].borda_presunto = ler.nextInt();
            }while(gar[x].borda_presunto>gar[x].presunto);
            ler.nextLine();
        }
    }
    
    static void Listar(){
        System.out.println("Relação das vendas");
        System.out.println("Nome\t\tValor total(Muçarela)\t\tValor total(Presunto)\t\tCom borda(Muçarela)\t\tSem borda(Presunto)\t\tValor da comissao");
        for(x=0;x<3;x++){
            System.out.print(gar[x].nome+"\t\t");
            System.out.print(gar[x].Mucarela()+"\t\t");
            System.out.print(gar[x].Presunto()+"\t\t");
            System.out.print(gar[x].borda_mucarela+"\t\t");
            System.out.print(gar[x].borda_presunto+"\t\t");
            System.out.println(gar[x].Comissao());
        }
    }
    
}
