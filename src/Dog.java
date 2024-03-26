public class Dog extends Animal {
    public Dog() {
        name = "dog";
    }
    public Dog(String name){
        this.name = name;
    }

    @Override
    public void sounds() {
        System.out.println("bow bow");
    }

}
