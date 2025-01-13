package classes;
public class Vaca extends Animal{
    @Override
    public float adicional() {
        if(pesoTotal()<=1200)
            return (float) (valorBasico()*1.5/100);
        else if(pesoTotal()<=1800)
            return (float) (valorBasico()*1.9/100);
        else 
            return (float) (valorBasico()*2.4/100);
    }

    @Override
    public float valorBasico() {
        return pesoTotal() * this.valorKg;
    }

    @Override
    public float valorVenda() {
        return valorBasico() + adicional();
    }

    @Override
    public float pesoTotal() {
        return this.pesoMedio * this.quantidade;
    }
}
