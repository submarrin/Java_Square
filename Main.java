public class Main {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.printSquare();
        s1.x = 3;
        s1.s = 12.3;
        s1.printSquare();
        double p = s1.perimetrSquare();
        System.out.println("Периметр = "+ p);
        Square s2 = new Square();
        s2.s = 3.14;
        s2.zoomSquare(1.66);
        s2.printSquare();
        double d = s1.distance(s2);
        System.out.println("Расстояние = "+ d);
        s1.moveRandom();
        s1.printSquare();
    }
}