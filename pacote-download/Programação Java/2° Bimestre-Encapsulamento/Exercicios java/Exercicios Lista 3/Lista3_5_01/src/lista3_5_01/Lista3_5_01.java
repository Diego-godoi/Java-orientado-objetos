
package lista3_5_01;

import classe.Vendedores;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Lista3_5_01 {
    static Vendedores ven[] = new Vendedores[4];
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static int x,op;
    
    public static void main(String[] args) {
       do{
           Digitar();
           Listar();
           do{
               op = JOptionPane.showConfirmDialog(null, "Sair? (S/N): ");
           }while(op == 2);
       }while (op == 1);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "Gratificação de 4 vendedores");
        for (x=0; x<4;x++){
            ven[x] = new Vendedores();
            ven[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° vendedor: "));
            ven[x].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
            ven[x].setValor_total_mes(Float.parseFloat(JOptionPane.showInputDialog("Valor total vendido no mes ")));;
        }
    }
    
    static void Listar(){
        System.out.println("Relacao dos Vendedores");
        System.out.println("Nome\t\tIdade\t\tTotalVendido\t\tGratificação");
        for(x=0;x<4;x++){
            System.out.print(ven[x].getNome()+"\t\t");
            System.out.print(ven[x].getIdade()+"\t\t");
            System.out.print(ven[x].getValor_total_mes()+"\t\t");
            System.out.println(ven[x].Gratificacao());
        }
    }
        
    
}
