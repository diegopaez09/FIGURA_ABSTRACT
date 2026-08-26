public abstract class Figura{
    private String tipo;

    public Figura (String tipo){
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract double area();

    public void mostrarInfo(Figura una){
        System.out.println("___________________________");
        System.out.println("Tipo :  " + una.getTipo());
        System.out.println("Area : " + una.area());
    }
}