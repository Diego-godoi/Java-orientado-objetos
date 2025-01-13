
package lista4_2;

import classes.Funcionario;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Lista4_2 {
static int x,op;
static DecimalFormat df = new DecimalFormat("#,##0.00");
static Funcionario f[] = new Funcionario[5];
    
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
        JOptionPane.showMessageDialog(null, "Aumento de salario de 5 funcionarios");
        for(x=0;x<5;x++){
            f[x] = new Funcionario();
            f[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° funcionario: "));
            f[x].setTempo(Integer.parseInt(JOptionPane.showInputDialog("tempo de servico (em anos): ")));
            f[x].setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario atual: ")));
        }
    }
    
    static void Listar(){
        System.out.println("Relacao dos funcionarios");
        System.out.println("Nome\t\tTempo de Servico\t\tSalario atual\t\tNovo salario");
        for(x=0;x<5;x++){
            System.out.print(f[x].getNome()+"\t\t");
            System.out.print(f[x].getTempo()+"\t\t");
            System.out.print(f[x].getSalario()+"\t\t");
            System.out.println(f[x].Aumento());
        }
    }
}
