/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5_01;

import classes.Circulo;
import classes.Retangulo;
import classes.TrianguloRetangulo;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Lista5_01 {
    static int op;
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static Retangulo r = new Retangulo();
    static TrianguloRetangulo tr = new TrianguloRetangulo();
    static Circulo c = new Circulo();
    static float num1,num2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            JOptionPane.showMessageDialog(null, "Areas de 3 figuras planas");
            do{
                op = Integer.parseInt(JOptionPane.showInputDialog("Figuras planas:\n"
                                                + "1.Retangulo\n"
                                                + "2.Triangulo Retangulo\n"
                                                + "3.Circulo"));
            }while((op<1)||(op>3));
            if(op!=3){
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Largura: "));
                num2 = Float.parseFloat(JOptionPane.showInputDialog("Comprimento: "));
            }else{
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Raio: "));
            }
            switch(op){
                default:
                    JOptionPane.showMessageDialog(null, "Erro");
                case 1:
                    JOptionPane.showMessageDialog(null, df.format(r.Calcular(num1, num2)));
                case 2:
                    JOptionPane.showMessageDialog(null, df.format(tr.Calcular(num1, num2)));
                case 3:
                    JOptionPane.showMessageDialog(null, df.format(c.Calcular(num1,0)));
            }
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? ");
            }while(op==2);
        }while(op==1);
    }
    
}
