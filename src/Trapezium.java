public class Trapezium extends GeometricFigure{
    private int a,b,high;

    public Trapezium(int a, int b, int high) {
        this.a = a;
        this.b = b;
        this.high = high;
    }


    public float area(int a, int b, int high) {
        return (float) ((a + b) * high * 1.0 / 2 );
    }


    public int perimetr(int a, int b, int high) {
        return a+b+2*high;
    }

    @Override
    public int perimetr() {
        return a+b+2*high;
    }

    @Override
    public float area() {
        return (float) ((a + b) * high * 1.0 / 2 );
    }
}
