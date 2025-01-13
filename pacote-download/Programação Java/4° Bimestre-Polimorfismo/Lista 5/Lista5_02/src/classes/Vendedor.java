package classes;
public class Vendedor extends Funcionarios{
    private double vendaMes;

    @Override
    public double salarioTotal() {
        return this.salarioFixo + comissao();
    }
    @Override
    public double comissao(){
        return this.vendaMes * 10/100;
    }
    
    public double getVendaMes() {
        return vendaMes;
    }

    public void setVendaMes(double vendaMes) {
        this.vendaMes = vendaMes;
    }    

    
}
