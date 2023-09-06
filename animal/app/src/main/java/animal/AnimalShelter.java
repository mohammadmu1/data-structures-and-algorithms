package animal;
import java.util.Queue;
public class AnimalShelter {
    private Queue<Animal> dogQueue;
    private Queue<Animal> catQueue;


    public void enqueue(Animal animal) {
        if (animal.getSpecies().equals("dog")) {
            dogQueue.add(animal);
        } else if (animal.getSpecies().equals("cat")) {
            catQueue.add(animal);
        }
    }

    public Animal dequeue(String prefAnimal) {
        if (prefAnimal.equals("dog")) {
            return dogQueue.remove();
        } else if (prefAnimal.equals("cat")) {
            return catQueue.remove();
        } else {
            return null ;
        }
    }

}
