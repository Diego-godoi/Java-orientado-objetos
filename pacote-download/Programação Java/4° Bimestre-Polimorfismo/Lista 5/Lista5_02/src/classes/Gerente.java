package classes;
public class Gerente extends Funcionarios{
    private double vendaLoja ;
    @Override
    public double salarioTotal() {
        return this.salarioFixo + comissao();
    }
    
    @Override
    public double comissao() {
        if(this.vendaLoja<=12000)
            return this.vendaLoja * 1.0/100;
        else if(this.vendaLoja<=18000)
            return this.vendaLoja * 1.5/100;
        else if(this.vendaLoja<=22000)
            return this.vendaLoja * 2.0/100;
        else if(this.vendaLoja<=26000)
            return this.vendaLoja * 2.5/100;
        else 
            return this.vendaLoja * 3.0/100;
    }


    public void setVendaLoja(double vendaLoja) {
        this.vendaLoja = vendaLoja;
    }


    
}
