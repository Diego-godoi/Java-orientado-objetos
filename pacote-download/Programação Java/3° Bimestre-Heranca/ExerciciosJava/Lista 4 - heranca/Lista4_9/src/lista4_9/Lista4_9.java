/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista4_9;

import classes.Funcionarios;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lista4_9 {
    static int x,op;
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static Funcionarios f[] = new Funcionarios[5];
    static Date dataAtual = new Date();
    /**
     * @param args the command line arguments
     */
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
        JOptionPane.showMessageDialog(null, "Aumento do salario de 5 funcionarios");
        for(x=0;x<5;x++){
            f[x]  =new Funcionarios();
            f[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° funcionario: "));
            do{}while(!f[x].setAdimissao(JOptionPane.showInputDialog("Data de admissao: ")));
            f[x].setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario atual: ")));
        }
    }
    static void Listar(){
        System.out.println("Relacao dos funcionarios");
        System.out.println("Nome\t\tTempo de servico\t\tSalario atual\t\tSalario reajustado");
        for(x=0;x<5;x++){
            System.out.print(f[x].getNome()+"\t\t");
            System.out.println(f[x].Tempo(dataAtual)+"\t\t");
            System.out.println(f[x].getSalario()+"\t\t");
            int tempo = f[x].Tempo(dataAtual);
            System.out.println(f[x].Aumento(tempo));
        }
    }
    
}
