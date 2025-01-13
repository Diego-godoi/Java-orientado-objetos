/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public class Animal {
    protected int quantidade;
    protected float pesoMedio;
    protected float valorKg;
    
    public float adicional( ){
        return 0;
    }
    public float valorBasico() {
        return pesoTotal() * this.valorKg;
    }

    public float valorVenda() {
        return valorBasico() + adicional();
    }

    public float pesoTotal() {
        return this.pesoMedio * this.quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(float pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public float getValorKg() {
        return valorKg;
    }

    public void setValorKg(float valorKg) {
        this.valorKg = valorKg;
    }
    
    
}
