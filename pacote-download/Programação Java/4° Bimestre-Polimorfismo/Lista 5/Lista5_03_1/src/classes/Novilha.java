package classes;
public class Novilha extends Animal{

    @Override
    public float adicional() {
        if(pesoTotal()<=500)
            return (float) (valorBasico()*2.5/100);
        else if(pesoTotal()<=800)
            return (float) (valorBasico()*3.5/100);
        else 
            return (float) (valorBasico()*4.5/100);
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
