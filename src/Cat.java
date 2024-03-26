public class Cat extends Animal{
    public Cat() {
        name = "dog";
    }
    public Cat(String name){
        this.name = name;
    }

    @Override
    public void sounds() {
        System.out.println("meow meow");
    }
}
