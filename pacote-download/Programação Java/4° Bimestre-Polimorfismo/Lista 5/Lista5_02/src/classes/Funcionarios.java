package classes;
public abstract class Funcionarios{
    protected String nome;
    protected double salarioFixo;

    public abstract double comissao();
    public abstract double salarioTotal();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
}
