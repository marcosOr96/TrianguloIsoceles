public class Main {
    public static void main(String[] args) {
        Consola sc = new Consola();

        FiguraGeometrica f1 = new FiguraGeometrica(3);
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();

        p1.setUbicacionX(sc.leerEntero("eje x p1t1"));
        p1.setUbicacionY(sc.leerEntero("eje y p1t1"));
        p2.setUbicacionX(sc.leerEntero("eje x p2t1"));
        p2.setUbicacionY(sc.leerEntero("eje y p2t1"));
        p3.setUbicacionX(sc.leerEntero("eje x p3t1"));
        p3.setUbicacionY(sc.leerEntero("eje y p3t1"));

        f1.agregarTriangulo(p1,p2,p3);

        p1.setUbicacionX(sc.leerEntero("eje x p1t2"));
        p1.setUbicacionY(sc.leerEntero("eje y p1t2"));
        p2.setUbicacionX(sc.leerEntero("eje x p2t2"));
        p2.setUbicacionY(sc.leerEntero("eje y p2t2"));
        p3.setUbicacionX(sc.leerEntero("eje x p3t2"));
        p3.setUbicacionY(sc.leerEntero("eje y p3t2"));

        f1.agregarTriangulo(p1,p2,p3);

        p1.setUbicacionX(sc.leerEntero("eje x p1t3"));
        p1.setUbicacionY(sc.leerEntero("eje y p1t3"));
        p2.setUbicacionX(sc.leerEntero("eje x p2t3"));
        p2.setUbicacionY(sc.leerEntero("eje y p2t3"));
        p3.setUbicacionX(sc.leerEntero("eje x p3t3"));
        p3.setUbicacionY(sc.leerEntero("eje y p3t3"));

        f1.agregarTriangulo(p1,p2,p3);
        System.out.println(f1.hallarTrianguloAreaMayor());
    }
}
