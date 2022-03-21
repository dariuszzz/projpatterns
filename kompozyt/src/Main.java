public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.add(new Cat());
        farm.add(new Dog());
        farm.add(new Cat());

        farm.makeSounds();
    }
}
