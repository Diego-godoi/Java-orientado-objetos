package classes;
public class Gerente extends Funcionarios{
    private float vendaLoja ;
    @Override
    public float salarioTotal() {
        return this.salarioFixo + comissao();
    }
    
    @Override
    public float comissao() {
        if(this.vendaLoja<=12000)
            return (float) (this.vendaLoja * 1.0/100);
        else if(this.vendaLoja<=18000)
            return (float) (this.vendaLoja * 1.5/100);
        else if(this.vendaLoja<=22000)
            return (float) (this.vendaLoja * 2.0/100);
        else if(this.vendaLoja<=26000)
            return (float) (this.vendaLoja * 2.5/100);
        else 
            return (float) (this.vendaLoja * 3.0/100);
    }


    public void setVendaLoja(float vendaLoja) {
        this.vendaLoja = vendaLoja;
    }


    
}
