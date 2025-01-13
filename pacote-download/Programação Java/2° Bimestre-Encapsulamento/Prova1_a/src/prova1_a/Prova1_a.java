
package prova1_a;

import classe.Funcionario;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Prova1_a {
    static Funcionario f[] = new Funcionario[5];
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static int x,op;
    
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
        JOptionPane.showMessageDialog(null, "Calculo do servico de 5 trabalhadores");
        for(x=0;x<5;x++){
            f[x] = new Funcionario();
            f[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° funcionario: "));
            f[x].setLocal(Integer.parseInt(JOptionPane.showInputDialog("Locais de trabalho\n"
                                                                        + "1-Area do show"
                                                                        + "2-Praca de alimentacao"
                                                                        + "Informe o local: ")));
            f[x].setHoras(Integer.parseInt(JOptionPane.showInputDialog("Horas trabalhadas: ")));
            f[x].setValorhoras(Float.parseFloat(JOptionPane.showInputDialog("Valor pago por hora: ")));
        }
    }
    
    static void Listar(){
        System.out.println("Relacao de funcionarios e valor a pagar");
        System.out.println("Nome\t\tLocal\t\t\tHoras Trabalhadas\t\tServico\t\tAdicional\t\tTotal");
        for(x=0;x<5;x++){
            System.out.print(f[x].getNome()+"\t\t");
            System.out.print(f[x].getLocal()+"\t\t");
            System.out.print(f[x].getHoras()+"\t\t");
            System.out.print(f[x].Servico()+"\t\t");
            System.out.print(f[x].adicional()+"\t\t");
            System.out.println(f[x].Total());
        }
    }
    
}
