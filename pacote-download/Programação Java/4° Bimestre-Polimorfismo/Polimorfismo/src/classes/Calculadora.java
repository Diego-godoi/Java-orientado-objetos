
package classes;

public abstract class Calculadora {
    private float a,b;
    
    public abstract float Calcular(float x, float y);

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    
}
