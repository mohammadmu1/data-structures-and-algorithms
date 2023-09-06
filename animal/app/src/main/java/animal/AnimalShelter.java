package animal;
import java.util.NoSuchElementException;
public class AnimalShelter {
    private Queue<Animal> dogQueue;
    private Queue<Animal> catQueue;

    public AnimalShelter() {
        dogQueue = new Queue<>();
        catQueue = new Queue<>();
    }

    public void enqueue(Animal animal) {
        if (animal.getSpecies().equals("dog")) {
            dogQueue.enqueue(animal);
        } else if (animal.getSpecies().equals("cat")) {
            catQueue.enqueue(animal);
        }
    }

    public Animal dequeue(String prefAnimal) {
        if (prefAnimal.equals("dog")) {
            if (!dogQueue.isEmpty()) {
                return dogQueue.dequeue();
            } else {
                throw new NoSuchElementException("No dogs in the shelter");
            }
        } else if (prefAnimal.equals("cat")) {
            if (!catQueue.isEmpty()) {
                return catQueue.dequeue();
            } else {
                throw new NoSuchElementException("No cats in the shelter");
            }
        } else {
            return null;
        }
    }
}
