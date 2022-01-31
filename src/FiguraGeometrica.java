public class FiguraGeometrica{

    private Triangulo triangulos[];

    public FiguraGeometrica(int tamañoTriangulos) {
        triangulos = new Triangulo[tamañoTriangulos];
    }


    public Triangulo[] getTriangulos() {
        return triangulos;
    }

    public void setTriangulos(Triangulo[] triangulos) {
        this.triangulos = triangulos;
    }

    public void agregarTriangulo(Punto puntoA,Punto puntoB,Punto puntoC) {
        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i]==null){
                triangulos[i]=new Triangulo();
                triangulos[i].setLadoA(Math.sqrt(Math.pow((puntoA.getUbicacionX()- puntoB.getUbicacionX()),2)+Math.pow((puntoA.getUbicacionY()- puntoB.getUbicacionY()),2)));
                triangulos[i].setLadoB(Math.sqrt(Math.pow((puntoA.getUbicacionX()- puntoC.getUbicacionX()),2)+Math.pow((puntoA.getUbicacionY()- puntoC.getUbicacionY()),2)));
                triangulos[i].setLadoC(Math.sqrt(Math.pow((puntoB.getUbicacionX()- puntoC.getUbicacionX()),2)+Math.pow((puntoB.getUbicacionY()- puntoC.getUbicacionY()),2)));
                if (triangulos[i].getLadoA() == triangulos[i].getLadoB()) {
                    triangulos[i].setAltura(Math.sqrt(Math.pow((Math.abs(triangulos[i].getLadoA())-(Math.abs(triangulos[i].getLadoC()/2))),2)));
                    triangulos[i].setBase(triangulos[i].getLadoC());
                }
                if (triangulos[i].getLadoA() == triangulos[i].getLadoC()) {
                    triangulos[i].setAltura(Math.sqrt(Math.pow((Math.abs(triangulos[i].getLadoA())-(Math.abs(triangulos[i].getLadoB()/2))),2)));
                    triangulos[i].setBase(triangulos[i].getLadoB());
                }
                if (triangulos[i].getLadoB() == triangulos[i].getLadoC()) {
                    triangulos[i].setAltura(Math.sqrt(Math.pow((Math.abs(triangulos[i].getLadoB())-(Math.abs(triangulos[i].getLadoA()/2))),2)));
                    triangulos[i].setBase(triangulos[i].getLadoA());
                }
                break;
            }
        }
    }

    public double hallarTrianguloAreaMayor() {
        double area = 0;
        for (int i = 0; i < triangulos.length; i++) {
            area = triangulos[i].calcularArea();
            if (triangulos[i].calcularArea() > area) {
                area = triangulos[i].calcularArea();
            }
            if (triangulos[i].calcularArea() <= area) {
                area = area;
            }
        }
        return area;
    }
}
