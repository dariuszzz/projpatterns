public interface Animal {
    String sound = "";

    default void makeSound() {
        System.out.println(this.sound);
    }
}
