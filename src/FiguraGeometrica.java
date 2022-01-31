public class FiguraGeometrica {

    private String figura;
    private Triangulo triangulos[];
    private Cuadrado cuadrados[];

    public FiguraGeometrica(String figura) {
        this.figura = figura;
    }

    public FiguraGeometrica(int tamaño) {
        triangulos = new Triangulo[tamaño];
        cuadrados = new Cuadrado[tamaño];
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public Triangulo[] getTriangulos() {
        return triangulos;
    }

    public void setTriangulos(Triangulo[] triangulos) {
        this.triangulos = triangulos;
    }

    public Cuadrado[] getCuadrados() {
        return cuadrados;
    }

    public void setCuadrados(Cuadrado[] cuadrados) {
        this.cuadrados = cuadrados;
    }

    public void agregarTriangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i] == null) {
                triangulos[i] = new Triangulo();
                triangulos[i].setLadoA(Math.sqrt(Math.pow((puntoA.getUbicacionX() - puntoB.getUbicacionX()), 2) + Math.pow((puntoA.getUbicacionY() - puntoB.getUbicacionY()), 2)));
                triangulos[i].setLadoB(Math.sqrt(Math.pow((puntoA.getUbicacionX() - puntoC.getUbicacionX()), 2) + Math.pow((puntoA.getUbicacionY() - puntoC.getUbicacionY()), 2)));
                triangulos[i].setLadoC(Math.sqrt(Math.pow((puntoB.getUbicacionX() - puntoC.getUbicacionX()), 2) + Math.pow((puntoB.getUbicacionY() - puntoC.getUbicacionY()), 2)));
                if (triangulos[i].getLadoA() == triangulos[i].getLadoB()) {
                    triangulos[i].setAltura(Math.sqrt(Math.pow((Math.abs(triangulos[i].getLadoA()) - (Math.abs(triangulos[i].getLadoC() / 2))), 2)));
                    triangulos[i].setBase(triangulos[i].getLadoC());
                }
                if (triangulos[i].getLadoA() == triangulos[i].getLadoC()) {
                    triangulos[i].setAltura(Math.sqrt(Math.pow((Math.abs(triangulos[i].getLadoA()) - (Math.abs(triangulos[i].getLadoB() / 2))), 2)));
                    triangulos[i].setBase(triangulos[i].getLadoB());
                }
                if (triangulos[i].getLadoB() == triangulos[i].getLadoC()) {
                    triangulos[i].setAltura(Math.sqrt(Math.pow((Math.abs(triangulos[i].getLadoB()) - (Math.abs(triangulos[i].getLadoA() / 2))), 2)));
                    triangulos[i].setBase(triangulos[i].getLadoA());
                }
                break;
            }
        }
    }

    public void agregarCuadrado(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        for (int i = 0; i < cuadrados.length; i++) {
            if (cuadrados[i] == null) {
                cuadrados[i] = new Cuadrado();
                cuadrados[i].setLadoA(Math.sqrt(Math.pow((puntoA.getUbicacionX() - puntoB.getUbicacionX()), 2) + Math.pow((puntoA.getUbicacionY() - puntoB.getUbicacionY()), 2)));
                cuadrados[i].setLadoB(Math.sqrt(Math.pow((puntoB.getUbicacionX() - puntoC.getUbicacionX()), 2) + Math.pow((puntoB.getUbicacionY() - puntoC.getUbicacionY()), 2)));
                cuadrados[i].setLadoC(Math.sqrt(Math.pow((puntoC.getUbicacionX() - puntoD.getUbicacionX()), 2) + Math.pow((puntoC.getUbicacionY() - puntoD.getUbicacionY()), 2)));
                cuadrados[i].setLadoD(Math.sqrt(Math.pow((puntoD.getUbicacionX() - puntoA.getUbicacionX()), 2) + Math.pow((puntoD.getUbicacionY() - puntoA.getUbicacionY()), 2)));

                cuadrados[i].getAltura();
                cuadrados[i].getBase();
                break;
            }
        }
    }

    public double hallarAreaMayor() {
        double area = 0;
        int posicionMayor = 0;
        if (figura.equals("triangulo")) {
            for (int i = 0; i < triangulos.length; i++) {
                if (triangulos[i].calcularArea() > area) {
                    area = triangulos[i].calcularArea();
                    posicionMayor = i;
                }
            }
        }

        if (figura.equals("cuadrado")) {
            for (int i = 0; i < cuadrados.length; i++) {
                if (cuadrados[i].calcularArea() > area) {
                    area = cuadrados[i].calcularArea();
                    posicionMayor = i;
                }
            }
        }
        System.out.println(posicionMayor);
        return area;
    }
}
