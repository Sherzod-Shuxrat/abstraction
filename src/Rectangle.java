public class Rectangle extends GeometricFigure {
    private int a,b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int perimetr() {
        return 2*(a+b);
    }

    @Override
    public float area() {
        return a*b;
    }

    public int area(int a, int b) {
        return a*b;
    }
    public int perimetr(int a, int b){
        return 2*(a+b);
    }
}
