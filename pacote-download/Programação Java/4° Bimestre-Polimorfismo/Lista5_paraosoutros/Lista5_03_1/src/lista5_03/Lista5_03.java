/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista5_03;

import classes.Animal;
import classes.Novilha;
import classes.Vaca;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lista5_03 {
    static int op;
    static Animal novilha = new Novilha();
    static Animal vaca = new Vaca();
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
        JOptionPane.showMessageDialog(null, "CALCULO DA VENDA DE ANIMAIS");
        
        JOptionPane.showMessageDialog(null, "Venda de Novilhas");
        novilha.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de novilhas: ")));
        novilha.setPesoMedio(Float.parseFloat(JOptionPane.showInputDialog("Peso medio de cada novilha: ")));
        novilha.setValorKg(Float.parseFloat(JOptionPane.showInputDialog("Valor por Kg: ")));
        
        JOptionPane.showMessageDialog(null, "Venda de Vacas Adultas");
        vaca.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vacas adultas: ")));
        vaca.setPesoMedio(Float.parseFloat(JOptionPane.showInputDialog("Peso medio de cada vaca: ")));
        vaca.setValorKg(Float.parseFloat(JOptionPane.showInputDialog("Valor por Kg: ")));
    }
    
    static void listar(){
        float totalVenda = 0;
        System.out.println("        Resumo da venda");
        System.out.println("--NOVILHAS");
        System.out.println("Quantidade: "+novilha.getQuantidade());
        System.out.println("Peso Total: "+novilha.pesoTotal());
        System.out.println("Valor Básico: "+novilha.valorBasico());
        System.out.println("Valor do Adicional: "+novilha.adicional());
        System.out.println("Valor da Venda: "+novilha.valorVenda());
        
        System.out.println("");
        
        System.out.println("--VACAS ADULTAS");
        System.out.println("Quantidade: "+vaca.getQuantidade());
        System.out.println("Peso Total: "+vaca.pesoTotal());
        System.out.println("Valor Básico: "+vaca.valorBasico());
        System.out.println("Valor do Adicional: "+vaca.adicional());
        System.out.println("Valor da Venda: "+vaca.valorVenda());
        
        System.out.println("");
        totalVenda = vaca.valorVenda() + novilha.valorVenda();
        System.out.println("Valor Total da Venda:  "+totalVenda);
    }
}
