package lista1_01;

import classes.Alunos;
import java.util.Scanner;

public class Lista1_01 {
    static int x,y;
    static char op;
    static Scanner ler = new Scanner(System.in);
    static Alunos fun [] = new Alunos[5];

    public static void main(String[] args) {
        do{
          Digitar();
          Listar();
          do{
              System.out.println("sair?(s/n): ");
              op = Character.toUpperCase(ler.next().charAt(0));
          }while((op!='S')&&(op !='N'));
        }while (op !='S');

    }

    static void Digitar() {
        System.out.println("CADASTRO DE 5 ALUNOS");
        for (x=0;x<5;x++){
            fun[x] = new Alunos();
            System.out.println("Nome do "+(x+1)+"° aluno: ");
            fun[x].nome = ler.nextLine();
            for(y=0;y<4;y++){
                System.out.println((y+1)+"° nota: ");
                fun[x].nota[y] = ler.nextFloat();
               
            }
             ler.nextLine();
        }
    }

    static void Listar() {
        System.out.println("Relacao dos alunos");
        System.out.println("nome\t\tmedia\t\tsituacao final");
        for (x=0;x<5;x++){
            System.out.print(fun[x].nome+"\t\t");
            System.out.print(fun[x].Media()+"\t\t");
            System.out.println(fun[x].Situacao());
        }
    }
}    