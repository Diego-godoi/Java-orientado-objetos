package classes;
public abstract class Funcionarios{
    protected String nome;
    protected float salarioFixo;

    public abstract float comissao();
    public abstract float salarioTotal();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
}
