/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public abstract class Animal {
    protected int quantidade;
    protected float pesoMedio;
    protected float valorKg;
    
    public abstract float adicional();
    public abstract float valorBasico();

    public abstract float valorVenda();

    public abstract float pesoTotal();

    //get e set
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
