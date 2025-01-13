package classes;

public class Diaristas extends Funcionarios{ //subclasse Diaristas herdando a superclasse Funcionarios
    
    //constructor herdando superclasse Funcionarios
    public Diaristas(String nome, int tempo, float valorHora) {
        super(nome, tempo, valorHora);
    }

    //metodos sobrescrito da superclasse Funcionarios
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
