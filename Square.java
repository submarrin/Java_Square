class Square{
    public double x;
    public double y;
    public double s;
    public void printSquare(){
        System.out.println("Квадрат с центром ("+x+";"+y+") и стороной "+s);
    }
    public void moveSquare(double a,double b) {
        x = x + a;
        y = y + b;
    }
    public void zoomSquare(double k){
        s=s*k;
    }
    //периметр
    public double perimetrSquare() {
        double p = 4 * s;
        return p;
    }
    //расстояние между центрами
    public double distance(Square s1){
        double d = Math.sqrt((s1.x-x)*(s1.x-x) + (s1.y-y)*(s1.y-y));
        return d;
    }
    //перенос
    public void moveRandom(){
        x = 100 * Math.random();
        y = 100 * Math.random();
    }
}
