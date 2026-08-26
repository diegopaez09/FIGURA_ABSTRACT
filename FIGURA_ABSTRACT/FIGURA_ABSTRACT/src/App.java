public class App {
    public static void main(String[] args) throws Exception {
        Figura f1 = new Triangulo("Triangulo", 5 , 5 );
        Figura f2 = new Cuadrado("Cuadradro", 5);
        Figura f3 = new Circulo("Circulo", 2);
        Figura f4 = new Rectangulo("Rectangulo", 2, 5);
        f1.mostrarInfo(f1);
        f2.mostrarInfo(f2);
        f3.mostrarInfo(f3);
        f4.mostrarInfo(f4);
    }
}
