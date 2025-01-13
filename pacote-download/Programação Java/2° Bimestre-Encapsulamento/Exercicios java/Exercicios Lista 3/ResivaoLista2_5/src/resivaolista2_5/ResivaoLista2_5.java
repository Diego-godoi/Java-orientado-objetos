
package resivaolista2_5;

import classe.Vendedores;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class ResivaoLista2_5 {
    static Vendedores vend[] = new Vendedores[5];
    static int x,op;
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    
    public static void main(String[] args) {
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
        for(x=0;x<5;x++){
            vend[x] = new Vendedores();
            vend[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° vendedor: "));
            vend[x].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
            vend[x].setValormes(Float.parseFloat(JOptionPane.showInputDialog("Valor total vendido no mes: ")));
        }
    }
    
    static void Listar(){
        System.out.println("Relacao dos vendedores");
        System.out.println("Nome\t\tIdade\t\ttotal vendido\t\tGratificacao");
        for(x=0;x<5;x++){
            System.out.print(vend[x].getNome()+"\t\t");
            System.out.print(vend[x].getIdade()+"\t\t");
            System.out.print(vend[x].getValormes()+"\t\t");
            System.out.println(vend[x].Gratificacao());
        }
    }
}
