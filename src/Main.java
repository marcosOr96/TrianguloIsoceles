public class Main {
    public static void main(String[] args) {
        Consola sc = new Consola();

        FiguraGeometrica f1 = new FiguraGeometrica(sc.leerEntero("cantidad de elementos"));
        f1.setFigura(sc.leerCadena("Figura:"));
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();
        Punto p4 = new Punto();

        if (f1.getFigura().equals("triangulo")) {
            for (int i = 0; i < f1.getTriangulos().length; i++) {
                p1.setUbicacionX(sc.leerEntero("eje x p1t1"));
                p1.setUbicacionY(sc.leerEntero("eje y p1t1"));
                p2.setUbicacionX(sc.leerEntero("eje x p2t1"));
                p2.setUbicacionY(sc.leerEntero("eje y p2t1"));
                p3.setUbicacionX(sc.leerEntero("eje x p3t1"));
                p3.setUbicacionY(sc.leerEntero("eje y p3t1"));
                f1.agregarTriangulo(p1, p2, p3);
            }
            System.out.println(f1.hallarAreaMayor());
        }
        if (f1.getFigura().equals("cuadrado")) {
            for (int i = 0; i < f1.getCuadrados().length; i++) {
                p1.setUbicacionX(sc.leerEntero("eje x p1t1"));
                p1.setUbicacionY(sc.leerEntero("eje y p1t1"));
                p2.setUbicacionX(sc.leerEntero("eje x p2t1"));
                p2.setUbicacionY(sc.leerEntero("eje y p2t1"));
                p3.setUbicacionX(sc.leerEntero("eje x p3t1"));
                p3.setUbicacionY(sc.leerEntero("eje y p3t1"));
                p4.setUbicacionX(sc.leerEntero("eje x p4t1"));
                p4.setUbicacionY(sc.leerEntero("eje y p4t1"));
                f1.agregarCuadrado(p1, p2, p3, p4);
            }
            System.out.println(f1.hallarAreaMayor());
        }
    }
}
