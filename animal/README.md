#  
<!-- Description of the  -->
simple task to create basic animal shelter system that can hold dogs and cats. The shelter operates on a first-in, first-out (FIFO) basis

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../animal/Whiteboard%201.png)
### the code

```

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


```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
If the preference is "dog":
- Check if the dog queue is not empty.
- If not empty, dequeue and return the first dog in the shelter.
- If empty, throw an exception indicating there are no dogs in the shelter.

If the preference is "cat":
- Check if the cat queue is not empty.
- If not empty, dequeue and return the first cat in the shelter.
- If empty, throw an exception indicating there are no cats in the shelter.

If the preference is neither "dog" nor "cat," return null to indicate an invalid preference.


### Big O space/time

 * Time Complexity  O(1)
 * Space Complexity O(1)


### test code 

```

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

```
