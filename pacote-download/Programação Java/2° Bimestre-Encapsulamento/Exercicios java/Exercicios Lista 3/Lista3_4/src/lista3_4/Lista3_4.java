
package lista3_4;

import classe.Motoristas;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Lista3_4 {
    static Motoristas mo[] = new Motoristas[5];
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static int x,op;
    
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            Digitar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? (S/N): ");
            }while(op==2);
        }while(op==1);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "Programa de serviços de entregas de encomenda de uma Transportadora");
        for(x=0;x<5;x++){
            mo[x] = new Motoristas();
            mo[x].setNome(JOptionPane.showInputDialog("Nome do "+ (x+1)+"° motorista: "));
            mo[x].setKm(Float.parseFloat(JOptionPane.showInputDialog("Distancia percorrida (KM): ")));
        }
    }
    
    static void Listar(){
        System.out.println("Relação dos motoristas");
        System.out.println("Nome\t\tDistancia\t\tValor do Transporte\t\tTaxa de administração");
        for(x=0;x<5;x++){
            System.out.print(mo[x].getNome()+"\t\t");
            System.out.print(mo[x].getKm()+"\t\t");
            System.out.print(mo[x].Valor_Transporte()+"\t\t");
            System.out.println(mo[x].Taxa_Administracao());
        }
    }
    
}
