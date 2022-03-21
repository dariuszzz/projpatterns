import java.util.ArrayList;
import java.util.List;

public class Farm {
    private ArrayList<Animal> animal_list = new ArrayList();

    Farm() {}

    public void add(Animal child) {
        this.animal_list.add(child);
    }

    public void remove(Animal child) {
        this.animal_list.remove(child);
    }

    public void makeSounds() {
        for (Animal anim : this.animal_list) {
            anim.makeSound();
        }
    }
}
