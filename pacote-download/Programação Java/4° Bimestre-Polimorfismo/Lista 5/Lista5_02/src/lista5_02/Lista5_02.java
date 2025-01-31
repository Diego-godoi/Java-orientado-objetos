package lista5_02;

import classes.Gerente;
import classes.Vendedor;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Lista5_02 {
    static int op;
    static Gerente gerente = new Gerente();
    static Vendedor[] vendedor = new Vendedor[5];
    static Locale localePT = new Locale("pt","BR");  //usei o locale para definir uma localizacao para o sistema (pr-BR)
    static NumberFormat nf = NumberFormat.getCurrencyInstance(localePT); //usei um metodo da classe numberformat para fazer a formatacao dos valores monetarios
    
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
        double totalVendaMes = 0;
        JOptionPane.showMessageDialog(null, "Calculo do salario do funcionario de uma empresa");
        gerente.setNome(JOptionPane.showInputDialog("Digite o nome do gerente da empresa: "));
        gerente.setSalarioFixo(Double.parseDouble(JOptionPane.showInputDialog("Salario: ")));
        for (int i = 0; i < vendedor.length; i++) {
            vendedor[i] = new Vendedor();
            vendedor[i].setNome(JOptionPane.showInputDialog("Digite o nome do "+ (i+1)+"° vendedor: "));
            vendedor[i].setSalarioFixo(Double.parseDouble(JOptionPane.showInputDialog("Salario: ")));
            vendedor[i].setVendaMes(Double.parseDouble(JOptionPane.showInputDialog("Venda no mes: ")));
            totalVendaMes += vendedor[i].getVendaMes();
        }
        gerente.setVendaLoja(totalVendaMes);
    }
    
    static void listar(){
        System.out.println("Relacao dos Vendedores");
        System.out.println("Nome\t\tValor da venda\t\tValor da comissao\t\tSalario total");
        for(int i = 0; i < vendedor.length; i++) {
            System.out.print(vendedor[i].getNome()+"\t\t");
            System.out.print(nf.format(vendedor[i].getVendaMes())+"\t\t");
            System.out.print(nf.format(vendedor[i].comissao())+"\t\t");
            System.out.println(nf.format(vendedor[i].salarioTotal()));
        }
        
        System.out.println("Relacao do Gerente");
        System.out.println("Nome\t\tSalario\t\tComissao\t\tValor total a receber");
        System.out.print(gerente.getNome()+"\t\t");
        System.out.print(nf.format(gerente.getSalarioFixo())+"\t\t");
        System.out.print(nf.format(gerente.comissao())+"\t\t");
        System.out.println(nf.format(gerente.salarioTotal()));
    }
}
