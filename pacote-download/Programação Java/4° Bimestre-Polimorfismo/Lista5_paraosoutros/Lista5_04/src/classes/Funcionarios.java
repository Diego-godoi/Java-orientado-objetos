/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public abstract class Funcionarios {
    protected String nome;
    protected int tempo;
    protected float valorHora;
    //1 é horista,  2 é diarista

    public Funcionarios(String nome, int tempo, float valorHora) {
        this.nome = nome;
        this.tempo = tempo;
        this.valorHora = valorHora;
    }
    
    public abstract float adicional();

    public abstract float salario();
    
    public abstract float receber();
    
    public String getNome() {
        return nome;
    }

    public int getTempo() {
        return tempo;
    }

    public float getValorHora() {
        return valorHora;
    }
}
