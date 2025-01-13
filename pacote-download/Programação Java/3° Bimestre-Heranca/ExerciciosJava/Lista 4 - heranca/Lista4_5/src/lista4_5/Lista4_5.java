
package lista4_5;

import classes.Taxistas;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Lista4_5 {
static int x,op;
static DecimalFormat df = new DecimalFormat("#,##0.00");
static Taxistas t[] = new Taxistas[10];
    
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
        JOptionPane.showMessageDialog(null, "TAXA DE MANUTENÇÃO DE 10 TAXISTAS");
        for(x=0;x<19;x++){
            t[x] = new Taxistas();
            t[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° taxista: "));
            t[x].setSemana(Float.parseFloat(JOptionPane.showInputDialog("Valor total ganho na semana: ")));
        }
    }
    
    static void Listar(){
        System.out.println("RELAÇÃO DOS TAXISTAS");
        System.out.println("Nome\t\tValor total ganho na semana\t\tTaxa de manutenção");
        float totalganho =0, totalmanutencao = 0;
        for(x=0;x<10;x++){
            System.out.print(t[x].getNome()+"\t\t");
            System.out.print(t[x].getSemana()+"\t\t");
            totalganho= totalganho + t[x].getSemana();
            System.out.println(t[x].TaxaManutenção());
            totalmanutencao = totalmanutencao + t[x].TaxaManutenção();
        }
        System.out.println("Valor total ganho pelos taxistas: "+ totalganho);
        System.out.println("Valor total de taxa de manutenção: "+ totalmanutencao);
    }
}
