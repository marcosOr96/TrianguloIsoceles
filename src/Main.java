public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.setCantTriangulo(4);
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();
        p1.setUbicacionX(5);
        p1.setUbicacionY(3);
        p2.setUbicacionX(-5);
        p2.setUbicacionY(3);
        p3.setUbicacionX(0);
        p3.setUbicacionY(8);

        t1.setLadoA(Math.sqrt(Math.pow((p1.getUbicacionX()- p2.getUbicacionX()),2)+Math.pow((p1.getUbicacionY()- p2.getUbicacionY()),2)));
        t1.setLadoB(Math.sqrt(Math.pow((p1.getUbicacionX()- p3.getUbicacionX()),2)+Math.pow((p1.getUbicacionY()- p3.getUbicacionY()),2)));
        t1.setLadoC(Math.sqrt(Math.pow((p2.getUbicacionX()- p3.getUbicacionX()),2)+Math.pow((p2.getUbicacionY()- p3.getUbicacionY()),2)));

        if (t1.getLadoA() == t1.getLadoB()) {
            t1.setAltura(Math.sqrt(Math.pow((Math.abs(t1.getLadoA())-(Math.abs(t1.getLadoC()/2))),2)));
            t1.setBase(t1.getLadoC());
        }
        if (t1.getLadoA() == t1.getLadoC()) {
            t1.setAltura(Math.sqrt(Math.pow((Math.abs(t1.getLadoA())-(Math.abs(t1.getLadoB()/2))),2)));
            t1.setBase(t1.getLadoB());
        }
        if (t1.getLadoB() == t1.getLadoC()) {
            t1.setAltura(Math.sqrt(Math.pow((Math.abs(t1.getLadoB())-(Math.abs(t1.getLadoA()/2))),2)));
            t1.setBase(t1.getLadoA());
        }

        System.out.println(t1.getLadoA());
        System.out.println(t1.getLadoB());
        System.out.println(t1.getLadoC());
        System.out.println(t1.calcularPerimetro());
        System.out.println(t1.calcularArea());
    }
}
