/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista4_8;

import classes.Vendedores;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lista4_8 {
    static int x,op;
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static Vendedores v[] = new Vendedores[4];
    static Date dataAtual = new Date();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            Digitar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? ");
            }while(op==2);
        }while(op==1);
    }
    
        static void Digitar(){
            JOptionPane.showMessageDialog(null, "Gratificacao de 4 vendedores");
            for(x=0;x<4;x++){
                v[x] = new Vendedores();
                v[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° vendedor: "));
                do{}while(!v[x].setNasc(JOptionPane.showInputDialog("Data de nascimetno: ")));
                v[x].setValor(Float.parseFloat(JOptionPane.showInputDialog("Valor total vendido no mes: ")));
            }
        }
        
        static void Listar(){
            System.out.println("Relacao dos vendedores");
            System.out.println("Nome\t\tIdade\t\tValor da venda\t\tValor da gratificacao");
            for(x=0;x<4;x++){
                System.out.print(v[x].getNome()+"\t\t");
                System.out.print(v[x].Idade(dataAtual)+"\t\t");
                System.out.print(v[x].getValor()+"\t\t");
                int idade = v[x].Idade(dataAtual);
                System.out.println(v[x].Gratificacao(idade));
            }
        }
}
