public class Dog extends Animal implements Pet {
    private String owner;

    public Dog(String name, String family, String owner) {
        super(name, family);
        this.owner = owner;
    }

    @Override
    void sound() {
        System.out.println("GuaGuau!");
    }

    @Override
    public void iAm() {
        System.out.println(this.name);
    }

    @Override
    public void myOwnerIs() {
        System.out.println(this.owner);

    }

    public static void main(String[] args) {

        Dog dog = new Dog("Bruno", "Terrier", "Jess");
        System.out.println(dog.getFamily());
        dog.setFamily("Bulldog");

        // Method by abstract class
        dog.sound();

        // Methods by interface
        dog.iAm();
        dog.myOwnerIs();
    }
}
