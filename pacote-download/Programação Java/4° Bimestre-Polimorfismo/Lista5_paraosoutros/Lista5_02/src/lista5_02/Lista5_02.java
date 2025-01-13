package lista5_02;

import classes.Gerente;
import classes.Vendedor;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lista5_02 {
    static int op;
    static Gerente gerente = new Gerente();
    static Vendedor[] vendedor = new Vendedor[5];
    static DecimalFormat df = new DecimalFormat("#,###.00");
    
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            digitar();
            listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? ");
            }while(op==2);
        }while(op==1);
    }
    static void digitar(){
        float totalVendaMes = 0;
        JOptionPane.showMessageDialog(null, "Calculo do salario dos funcionarios");
        gerente.setNome(JOptionPane.showInputDialog("Digite o nome do gerente: "));
        gerente.setSalarioFixo(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));
        for (int i = 0; i < vendedor.length; i++) {
            vendedor[i] = new Vendedor();
            vendedor[i].setNome(JOptionPane.showInputDialog("Digite o nome do "+ (i+1)+"° vendedor: "));
            vendedor[i].setSalarioFixo(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));
            vendedor[i].setVendaMes(Float.parseFloat(JOptionPane.showInputDialog("Venda no mes: ")));
            totalVendaMes += vendedor[i].getVendaMes();
        }
        gerente.setVendaLoja(totalVendaMes);
    }
    
    static void listar(){
        System.out.println("Relacao dos Vendedores");
        System.out.println("Nome\t\tValor da venda\t\tValor da comissao\t\tSalario total");
        for(int i = 0; i < vendedor.length; i++) {
            System.out.print(vendedor[i].getNome()+"\t\t");
            System.out.print(df.format(vendedor[i].getVendaMes())+"\t\t");
            System.out.print(df.format(vendedor[i].comissao())+"\t\t");
            System.out.println(df.format(vendedor[i].salarioTotal()));
        }
        
        System.out.println("Relacao do Gerente");
        System.out.println("Nome\t\tSalario\t\tComissao\t\tValor total a receber");
        System.out.print(gerente.getNome()+"\t\t");
        System.out.print(df.format(gerente.getSalarioFixo())+"\t\t");
        System.out.print(df.format(gerente.comissao())+"\t\t");
        System.out.println(df.format(gerente.salarioTotal()));
    }
}
