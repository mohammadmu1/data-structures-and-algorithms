package animal;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
        Animal dog2 = new Animal("dog", "Max");

        shelter.enqueue(dog1);
        shelter.enqueue(cat1);
        shelter.enqueue(dog2);

        assertEquals("Buddy", shelter.dequeue("dog").getName());
        assertEquals("Whiskers", shelter.dequeue("cat").getName());
        assertEquals("Max", shelter.dequeue("dog").getName());
    }

    @Test
    public void testDequeueInvalidPreference() {
        assertNull(shelter.dequeue("bird"));
    }

    @Test
    public void testDequeueEmptyShelter() {
        assertNull(shelter.dequeue("dog"));
        assertNull(shelter.dequeue("cat"));
    }
}
