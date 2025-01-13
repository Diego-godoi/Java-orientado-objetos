package classes;
public class Vendedor extends Funcionarios{
    private float vendaMes;

    @Override
    public float salarioTotal() {
        return this.salarioFixo + comissao();
    }
    @Override
    public float comissao(){
        return this.vendaMes * 10/100;
    }
    
    public float getVendaMes() {
        return vendaMes;
    }

    public void setVendaMes(float vendaMes) {
        this.vendaMes = vendaMes;
    }    

    
}
