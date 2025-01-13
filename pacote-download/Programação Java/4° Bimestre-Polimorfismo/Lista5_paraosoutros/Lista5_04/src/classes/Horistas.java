/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public class Horistas extends Funcionarios{

    public Horistas(String nome, int tempo, float valorHora) {
        super(nome, tempo, valorHora);
    }

    

    @Override
    public float adicional() {
        if(this.tempo>220)
            return salario()*10/100;
        return 0;
    }

    @Override
  public float salario() {
        return this.tempo * this.valorHora;
    }
    
    @Override
    public float receber() {
        return this.salario() + adicional();
    }
    
}
