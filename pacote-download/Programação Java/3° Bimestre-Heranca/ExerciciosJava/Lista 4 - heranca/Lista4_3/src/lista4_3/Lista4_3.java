/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista4_3;

import classes.Vendedor;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lista4_3 {
static int x,op;
static DecimalFormat df = new DecimalFormat("#,##0.00");
static Vendedor v[]= new Vendedor[4];
    
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
        JOptionPane.showMessageDialog(null, "Comissao de 4 vendedores");
        for(x=0;x<4;x++){
            v[x]=new Vendedor();
            v[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° vendedor: "));
            v[x].setQuant_be(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de bezerros vendidos: ")));
            v[x].setPeso_medio(Float.parseFloat(JOptionPane.showInputDialog("Peso medio de cada bezerro: ")));
            v[x].setValor_be(Float.parseFloat(JOptionPane.showInputDialog("Valor Unitario: ")));
            v[x].setPercentual(Float.parseFloat(JOptionPane.showInputDialog("Percentual da comissao: ")));
        }
    }
    
    static void Listar(){
        int quant_total_be = 0;
        float peso = 0;
        System.out.println("Relacao dos vendedores");
        System.out.println("Nome\t\tQuantidade de bezerros\t\tPeso total\t\tValor total\t\tValor da comissao");
        for(x=0;x<4;x++){
            System.out.print(v[x].getNome()+"\t\t");
            System.out.print(v[x].getQuant_be()+"\t\t");
            quant_total_be = quant_total_be + v[x].getQuant_be();
            System.out.println(v[x].Peso_total()+"\t\t");
            peso = peso + v[x].Peso_total();
            System.out.println(v[x].Valor_total()+"\t\t");
            System.out.println(v[x].Comissao());
        }
        System.out.println("Total de bezerros vendidos pelo 4 vendedores: "+ quant_total_be);
        System.out.println("Peso total de todos os bezerros vendidos: "+ peso);
    }
}
