public class Duck extends Animal{
    public Duck() {
        name = "duck";
    }
    public Duck(String name){
        this.name = name;
    }

    @Override
    public void sounds() {
        System.out.println("quack quack");
    }
}
