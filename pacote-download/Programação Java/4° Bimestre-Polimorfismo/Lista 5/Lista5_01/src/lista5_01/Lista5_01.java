/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5_01;

import classes.Circulo;
import classes.Retangulo;
import classes.TrianguloRetangulo;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Lista5_01 {
    static int op;
    static Locale localePT = new Locale("pt","BR");
    static NumberFormat nf = NumberFormat.getInstance(localePT);
    static Retangulo r = new Retangulo();
    static TrianguloRetangulo tr = new TrianguloRetangulo();
    static Circulo c = new Circulo();
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
                                                + "2.Triangulo Retangulo"
                                                + "\n3.Circulo"
                                                + "\n4.Sair"));
            }while((op<1)||(op>4));
            switch(op){
                default:
                    JOptionPane.showMessageDialog(null, "Programa Encerrado");
                    break;
                case 1:
                    retangulo();
                    break;
                case 2:
                    trianguloRetangulo();
                    break;
                case 3:
                    circulo();
                    break;
            }
        }while(op!=4);
    }
    static void retangulo(){
        r.setA(Float.parseFloat(JOptionPane.showInputDialog("Largura: ")));
        r.setB(Float.parseFloat(JOptionPane.showInputDialog("Comprimento: ")));
        JOptionPane.showMessageDialog(null, "Area do retangulo: "+nf.format(r.Calcular()));
    }
    static void trianguloRetangulo(){
        r.setA(Float.parseFloat(JOptionPane.showInputDialog("Base: ")));
        r.setB(Float.parseFloat(JOptionPane.showInputDialog("Altura: ")));
        JOptionPane.showMessageDialog(null, "Area do triangulo retangulo: "+nf.format(tr.Calcular()));
    }
    static void circulo(){
        r.setA(Float.parseFloat(JOptionPane.showInputDialog("Raio: ")));
        JOptionPane.showMessageDialog(null, "Area do circulo: "+nf.format(c.Calcular()));
    }
}
