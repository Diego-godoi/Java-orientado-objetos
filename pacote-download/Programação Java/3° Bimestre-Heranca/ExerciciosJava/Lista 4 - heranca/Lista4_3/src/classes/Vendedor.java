/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public class Vendedor extends Pessoa {
    private int quant_be;
    private float peso_medio;
    private float valor_be;
    private float percentual;

    public int getQuant_be() {
        return quant_be;
    }

    public void setQuant_be(int quant_be) {
        this.quant_be = quant_be;
    }

    public float getPeso_medio() {
        return peso_medio;
    }

    public void setPeso_medio(float peso_medio) {
        this.peso_medio = peso_medio;
    }

    public float getValor_be() {
        return valor_be;
    }

    public void setValor_be(float valor_be) {
        this.valor_be = valor_be;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }
    
    
   // Peso de todos os bezerros
    public float Peso_total(){
        return(peso_medio*quant_be);
    }
    
    //Valor total de todos os bezerros
    public float Valor_total(){
        return(quant_be*valor_be);
    }
    
    //Comisao sobre o valor total dos bezerros e o percentual da comissao
    public float Comissao(){
        return(Valor_total()*percentual/100);
    }
}
