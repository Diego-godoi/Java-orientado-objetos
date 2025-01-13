
package revisaolista2_6;

import classe.Taxista;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class RevisaoLista2_6 {

   static Taxista ta[]=new Taxista[10];
   static DecimalFormat df = new DecimalFormat("#,##0.00");
   static int x,op;
    public static void main(String[] args) {
        do{
            Digitar();
            Listar();
            do{
                op= JOptionPane.showConfirmDialog(null, "Sair? ");
            }while(op==2);
        }while(op==2);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "10 taxistas");
        for(x=0;x<10;x++){
            ta[x] = new Taxista();
            ta[x].setNome(JOptionPane.showInputDialog("Nome: "));
            ta[x].setValorsemana(Float.parseFloat(JOptionPane.showInputDialog("Valor total da semana: ")));
        }
    }
    
    static void Listar(){
        float total =0;
        float totaltaxa = 0;
        System.out.println("Relacao dos taxistas");
        System.out.println("Nome\t\tvalor ganho na semana\t\ttaxa de manutencao");
        for(x=0;x<10;x++){
            total=total+ta[x].getValorsemana();
            totaltaxa = totaltaxa+ta[x].taxamanutencao();
            System.out.print(ta[x].getNome()+"\t\t");
            System.out.print(ta[x].getValorsemana()+"\t\t");
            System.out.println(ta[x].taxamanutencao());
        }
        System.out.println("Valor total ganho\t\tValor total de taxa de manuntencao");
        System.out.print(total+"\t\t");
        System.out.println(totaltaxa);
    }
}
