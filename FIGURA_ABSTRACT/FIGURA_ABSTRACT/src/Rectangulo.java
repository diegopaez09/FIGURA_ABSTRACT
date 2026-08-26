public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(String tipo ,int base,int altura){
        super(tipo);
        this.base=base;
        this.altura=altura;
    }
    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double area(){
        System.out.println("El area del triangulo es : " + ((int)(this.altura*this.base)));
        return ((double)(this.altura*this.base));

    }
}


