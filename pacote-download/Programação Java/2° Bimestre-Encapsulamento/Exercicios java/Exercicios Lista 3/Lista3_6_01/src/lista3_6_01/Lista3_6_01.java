
package lista3_6_01;

import classe.Taxistas;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Lista3_6_01 {
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static Taxistas ta[] = new Taxistas[3];
    static int op,x;
   
    public static void main(String[] args) {
        do{
            Digitar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? (S/N): ");
            }while(op == 2);
        }while(op ==1);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "Calculo da taxa de Manutencao");
        for(x=0;x<3;x++){
            ta[x] = new Taxistas();
            ta[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° taxista: "));
            ta[x].setValor_semana(Float.parseFloat(JOptionPane.showInputDialog("Valor ganho na semana: ")));
        }
    }
    
    static void Listar(){
        float total_ganho = 0, total_taxamanutencao =0;
        System.out.println("Relação dos Taxista");
        System.out.println("Nome\t\tValor Ganho\t\tTaxa de Manutenção");
        for(x=0;x<3;x++){
            System.out.print(ta[x].getNome()+"\t\t");
            System.out.print(ta[x].getValor_semana()+"\t\t");
            System.out.println(ta[x].Taxa_Manutencao());
            total_ganho = total_ganho + ta[x].getValor_semana();
            total_taxamanutencao = total_taxamanutencao + ta[x].Taxa_Manutencao();
        }
        System.out.println("");
        System.out.println("Valor total ganho pelos taxistas: "+ total_ganho);
        System.out.println("Valor total da taxa de manutencao: "+ total_taxamanutencao);
    }
    
}
