public class Triangulo extends Main{

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

    public int getCantTriangulo() {
        return cantTriangulo;
    }

    public void setCantTriangulo(int cantTriangulo) {
        this.cantTriangulo = cantTriangulo;
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

    public double areaMayor() {
        Triangulo matrizTriangulo[][] = new Triangulo[cantTriangulo][6];
        for (int i = 0; i < matrizTriangulo.length; i++) {
            matrizTriangulo[i][0] = getLadoA();
            matrizTriangulo[i][1] = getLadoB();
            matrizTriangulo[i][2] = getLadoC();
            matrizTriangulo[i][3] = getBase();
            matrizTriangulo[i][4] = getAltura();
            matrizTriangulo[i][5] = calcularArea();
            for (int j = 0; j < matrizTriangulo[i].length; j++) {
                return matrizTriangulo[i][j] = matrizTriangulo[i][j];
            }
        }
        return 0;
    }
}

