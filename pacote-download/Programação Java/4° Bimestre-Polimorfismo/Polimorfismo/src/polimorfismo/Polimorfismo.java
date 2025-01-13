/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import classes.Adicao;
import classes.Divisao;
import classes.Multiplicacao;
import classes.Subtracao;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Polimorfismo {
    static int op;
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static Adicao a = new Adicao();
    static Subtracao s = new Subtracao();
    static Divisao d = new Divisao();
    static Multiplicacao m = new Multiplicacao();
    static float num1,num2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do{
            JOptionPane.showMessageDialog(null, "Operacoes com dois numeros");
            num1=Float.parseFloat(JOptionPane.showInputDialog("Primeiro numero: "));
            num2 = Float.parseFloat(JOptionPane.showInputDialog("Segundo numero: "));
            do{
                op = Integer.parseInt(JOptionPane.showInputDialog("Operacoes:\n"
                                                                + "1.Adicao\n"
                                                                + "2.Subtracao\n"
                                                                + "3.Multiplicacao\n"
                                                                + "4.Divisao"));
            }while((op<1)||(op>4));
            switch(op){
                default:
                    JOptionPane.showMessageDialog(null, "Erro");
                case 1:
                    JOptionPane.showMessageDialog(null,df.format(a.Calcular(num1, num2)));
                case 2:
                    JOptionPane.showMessageDialog(null,df.format(s.Calcular(num1, num2)));
                case 3:
                    JOptionPane.showMessageDialog(null,df.format(m.Calcular(num1, num2)));
                case 4:
                    JOptionPane.showMessageDialog(null, df.format(d.Calcular(num1, num2)));
            }
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? ");
            }while(op==2);
        }while(op==1);
    }
}
