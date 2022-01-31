public class Triangulo extends Punto{

    private int cantTriangulo;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double altura;
    private double base;

    public Triangulo() {
    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Triangulo(int cantTriangulo) {
        this.cantTriangulo = cantTriangulo;
    }

    public int getCantTriangulo() {
        return cantTriangulo;
    }

    public void setCantTriangulo(int cantTriangulo) {
        this.cantTriangulo = cantTriangulo;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calcularPerimetro(){
        if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            double perimetro = ladoA + ladoB + ladoC;
            return perimetro;
        }
        return 0;
    }

    public double calcularArea() {
        double area = base*altura/2;
        return area;
    }
}

