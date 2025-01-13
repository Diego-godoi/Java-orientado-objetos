
package lista3_3;

import classe.Clientes;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Lista3_3 {
    //variaveis
    static Clientes cli[] = new Clientes[5];
    static int x,op;
    static DecimalFormat df = new DecimalFormat("#, ##0.00");
    
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            Digitar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? (S/N): ");
            }while (op == 2);
        }while (op==1);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "Promoção de fidelidade na Academia");
        for(x=0;x<5;x++){
            cli[x] = new Clientes();
            cli[x].setNome(JOptionPane.showInputDialog("Nome do "+ (x+1)+ "° clinte: "));
            cli[x].setTempo(Integer.parseInt(JOptionPane.showInputDialog("Tempo de contrato (Mes): ")));
            do{}while(!cli[x].setSexo(Character.toUpperCase(JOptionPane.showInputDialog("Sexo (M/F): ").charAt(0))));
        }
    }
    
    static void Listar(){
        System.out.println("Relação dos Clientes");
        System.out.println("Nome\t\tValor da Mensalidade");
        for(x=0;x<5;x++){
            System.out.print(cli[x].getNome()+"\t\t");
            System.out.println(cli[x].Mensalidade());
        }
    }
}
