
package lista1_01;

import classe.Cliente;
import java.util.Scanner;


public class Lista1_01 {
    static Cliente cli[]= new Cliente[10];
    static int x;
    static char op;
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        do{
           Digitar();
           Consultar();
           Listar();
           do{
               System.out.println("Sair?(S/N): ");
               op = Character.toUpperCase(ler.next().charAt(0));
           }while ((op!='S')&&(op !='N'));
        }while(op!='S');
    }
    
    static void Digitar(){
        System.out.println("Cadastro de 10 cliente");
        for(x=0;x<10;x++){
            cli[x]=new Cliente();
            System.out.print("nome do "+(x+1)+"° cliente: ");
            cli[x].nome = ler.nextLine();
            System.out.print("Idade: ");
            cli[x].idade = ler.nextInt();
            do{
                System.out.print("sexo (F/M): ");
                cli[x].sexo = Character.toUpperCase(ler.next().charAt(0));
            }while(!cli[x].ValidaSexo());
            ler.nextLine();
        }
    }
    
    static void Consultar(){
        boolean achou = false;
        String valor;
        do{
            System.out.println("Consulta cliente por nome");
            System.out.print("Nome: ");
            valor = ler.nextLine();
            x = 0;
            while((x<10)&&(!achou)){
                if (valor.equals(cli[x].nome))
                    achou=true;
                else
                    x++;
            }
            if (achou)
                Mostrar();
            else
                System.out.println("Cliente nao encontrado!!");
            do{
                System.out.println("Deseja consultar outro?(S/N): ");
                op = Character.toUpperCase(ler.next().charAt(0));
            }while((op!='S')&&(op!='N'));
        }while(op!='N');
    }
    
    static void Mostrar(){
        System.out.println("Cliente: "+ cli[x].nome);
        System.out.println("Sexo: "+ cli[x].sexo);
        System.out.println("Idade: "+ cli[x].idade);
    }
    
    static void Listar(){
        System.out.println("Relacao das clientes");
        System.out.println("Nome\t\tIdade");
        for(x=0;x<10;x++){
            if (cli[x].sexo == 'F'){
                System.out.print(cli[x].nome+"\t\t");
                System.out.println(cli[x].idade);
            }       
        }
        System.out.println("Relacao dos clientes");
        System.out.println("Nome\t\tIdade");
        for(x=0;x<10;x++){
            if (cli[x].sexo =='M'){
                System.out.print(cli[x].nome+"\t\t");
                System.out.println(cli[x].idade);
            }
        }
    }
}
