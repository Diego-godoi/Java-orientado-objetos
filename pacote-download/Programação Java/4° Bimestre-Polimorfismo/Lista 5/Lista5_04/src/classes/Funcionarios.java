package classes;

public abstract class Funcionarios { //superclasse abstrata Funcionarios
    //atributos
    protected String nome;
    protected int tempo;
    protected float valorHora;

    //constructor 
    public Funcionarios(String nome, int tempo, float valorHora) {
        this.nome = nome;
        this.tempo = tempo;
        this.valorHora = valorHora;
    }
    
    //metodos abstratos que serao sobrescrito pelas subclasses
    public abstract float adicional();

    public abstract float salario();
    
    public abstract float receber();
    
    //getters dos atributos de Funcionarios
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
