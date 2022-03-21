public class Dog implements Animal {
    private String sound = "woof";

    public void makeSound() {
        System.out.println(this.sound);
    }
}