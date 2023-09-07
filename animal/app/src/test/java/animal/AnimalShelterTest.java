package animal;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    private AnimalShelter shelter;

    @Before
    public void setUp() {
        shelter = new AnimalShelter();
    }

    @Test
    public void testEnqueueAndDequeue() {
        Animal dog1 = new Animal("dog", "Buddy");
        Animal cat1 = new Animal("cat", "Whiskers");
        Animal dog2 = new Animal("dog", "Rex");

        shelter.enqueue(dog1);
        shelter.enqueue(cat1);
        shelter.enqueue(dog2);

        Animal dequeuedDog = shelter.dequeue("dog");
        assertEquals("Buddy", dequeuedDog.getName());

        Animal dequeuedCat = shelter.dequeue("cat");
        assertEquals("Whiskers", dequeuedCat.getName());

        Animal dequeuedDog2 = shelter.dequeue("dog");
        assertEquals("Rex", dequeuedDog2.getName());
    }

    @Test(expected = NoSuchElementException.class)
    public void testDequeueEmptyQueue() {
        shelter.dequeue("dog");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDequeueInvalidPreference() {
        shelter.enqueue(new Animal("rabbit", "Hoppy"));
        shelter.dequeue("rabbit");
    }
}
