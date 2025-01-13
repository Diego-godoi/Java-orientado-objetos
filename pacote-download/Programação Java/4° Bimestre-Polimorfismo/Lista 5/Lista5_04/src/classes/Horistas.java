package classes;

public class Horistas extends Funcionarios{//subclasse Diaristas herdando a superclasse Funcionarios
    
    //constructor herdando superclasse Funcionarios
    public Horistas(String nome, int tempo, float valorHora) {
        super(nome, tempo, valorHora);
    }

    
    //metodos sobrescrito da superclasse Funcionarios
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
