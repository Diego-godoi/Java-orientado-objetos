/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista4_7;

import classes.Vendedores;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lista4_7 {
    static int x,op;
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static Vendedores v[] = new Vendedores[5];
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
                op = JOptionPane.showConfirmDialog(null, "Sair do programa? ");
            }while(op==2);
        }while(op==1);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "GRATIFICAÇÃO DE 5 VENDEDORES");
        for(x=0;x<5;x++){
            v[x] = new Vendedores();
            v[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° vendedor: "));
            do{}while(!v[x].setNasc(JOptionPane.showInputDialog("Data de nascimento(dd/mm/aaaa): ")));
                //problemas
                v.setDia(Float.parseFloat(JOptionPane.showInputDialog("valor vendido no"+(y+1)+"° dia: ")),x);

        }
    }
    
    static void Listar(){
        System.out.println("RELAÇÃO DOS VENDEDORES");
        System.out.println("Nome\t\tValor total de venda\t\tValor da gratifcação");
        for(x=0;x<5;x++){
            System.out.print(v[x].getNome()+"\t\t");
            System.out.print(v[x].Totalsemana()+"\t\t");
            int idade = v[x].Idade(dataAtual);
            System.out.println(v[x].Gratificacao(idade));
        }
    }
    
}
