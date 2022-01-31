public class Cuadrado {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;
    private double base;
    private double altura;

    public Cuadrado() {
    }

    public Cuadrado(double ladoA, double ladoB, double ladoC, double ladoD) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
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

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularPerimetro(){
        double perimetro = ladoA + ladoB + ladoC + ladoD;
        return perimetro;
    }

    public double calcularArea() {
        base = ladoA;
        altura = ladoA;
        double area = base*altura;
        return area;
    }
}
