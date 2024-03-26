public class Triangle extends GeometricFigure{
    private int a,b,c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimetr(int a,int b, int c){
        return a+b+c;
    }
    public int perimetr() {
        return a+b+c;
    }

   public float area(){
        float p = (float) (perimetr() * 1.0 / 2);
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
   }

}
