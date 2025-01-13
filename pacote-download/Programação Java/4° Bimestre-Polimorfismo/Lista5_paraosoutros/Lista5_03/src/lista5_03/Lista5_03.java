/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista5_03;

import classes.Novilha;
import classes.Vaca;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lista5_03 {
    static int op;
    static Novilha novilha = new Novilha();
    static Vaca vaca = new Vaca();
    /**
     * @param args the command line arguments
     */
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
        JOptionPane.showMessageDialog(null, "Calcula da venda de animais de uma fazenda");
        JOptionPane.showMessageDialog(null, "Venda de novilhas");
        novilha.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de novilhas: ")));
        novilha.setPesoMedio(Float.parseFloat(JOptionPane.showInputDialog("Peso medio de cada novilha: ")));
        novilha.setValorKg(Float.parseFloat(JOptionPane.showInputDialog("Valor por Kg: ")));
        JOptionPane.showMessageDialog(null, "Venda de vacas adultas");
        vaca.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vacas adultas: ")));
        vaca.setPesoMedio(Float.parseFloat(JOptionPane.showInputDialog("Peso medio de cada vaca: ")));
        vaca.setValorKg(Float.parseFloat(JOptionPane.showInputDialog("Valor por Kg: ")));
    }
    
    static void listar(){
        float totalVenda =0;
        System.out.println("Resumo da venda");
        System.out.println("Novilhas");
        System.out.println("Quantidade\t\tPeso Total\t\tValor basico\t\tValor do adicional\t\tValor da venda");
        System.out.print(novilha.getQuantidade()+"\t\t");
        System.out.print(novilha.pesoTotal()+"\t\t");
        System.out.print(novilha.valorBasico()+"\t\t");
        System.out.print(novilha.adicional()+"\t\t");
        System.out.println(novilha.valorVenda());
        
        System.out.println("Vacas Adultas");
        System.out.println("Quantidade\t\tPeso Total\t\tValor basico\t\tValor do adicional\t\tValor da venda");
        System.out.print(vaca.getQuantidade()+"\t\t");
        System.out.print(vaca.pesoTotal()+"\t\t");
        System.out.print(vaca.valorBasico()+"\t\t");
        System.out.print(vaca.adicional()+"\t\t");
        System.out.println(vaca.valorVenda());
        
        System.out.println("");
        totalVenda = vaca.valorVenda() + novilha.valorVenda();
        System.out.println("Valor Total da Venda:  "+totalVenda);
    }
}
