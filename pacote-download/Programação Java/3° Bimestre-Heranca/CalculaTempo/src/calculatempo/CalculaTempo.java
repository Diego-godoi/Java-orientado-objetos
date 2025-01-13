
package calculatempo;

import classe.Pessoa;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class CalculaTempo {
    static Pessoa p[]= new Pessoa[5];
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static Date dataHoje = new Date();
    static int x,op;
    
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
        JOptionPane.showMessageDialog(null, "Programa para calcular a idade");
        for(x=0;x<5;x++){
            p[x] = new Pessoa();
            p[x].setNome(JOptionPane.showInputDialog("Nome da "+(x+1)+"° pessoa: "));
            do{}while(!p[x].setNascimento(JOptionPane.showInputDialog("Data de nascimento: ")));
        }
    }
    
    static void Listar(){
        System.out.println("Relacao das pessoas");
        System.out.println("Nome\t\tIdade");
        for(x=0;x<5;x++){
            System.out.print(p[x].getNome()+"\t\t");
            System.out.println(p[x].Idade(dataHoje));
        }
    }
}
