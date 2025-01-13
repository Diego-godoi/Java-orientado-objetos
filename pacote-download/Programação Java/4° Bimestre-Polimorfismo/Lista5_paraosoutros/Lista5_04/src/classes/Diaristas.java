/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public class Diaristas extends Funcionarios{

    public Diaristas(String nome, int tempo, float valorHora) {
        super(nome, tempo, valorHora);
    }

    
    @Override
    public float adicional() {
            return salario()*5/100;
    }
    @Override
    public float salario() {
        return this.tempo * this.valorHora * 8;
    }
    
    @Override
    public float receber() {
        return this.salario() + adicional();
    }
}
