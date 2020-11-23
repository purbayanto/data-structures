package id.dondon.ctci.chapter3;

import id.dondon.ctci.chapter3.shelter.Cat;
import id.dondon.ctci.chapter3.shelter.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalShelterTest {

    @Test
    public void animalShelter() {
        Cat callie = new Cat("Callie");
        Cat kiki = new Cat("Kiki");
        Dog fido = new Dog("Fido");
        Dog dora = new Dog("Dora");
        Cat kari = new Cat("Kari");

        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(callie);
        animalShelter.enqueue(kiki);
        animalShelter.enqueue(fido);
        animalShelter.enqueue(dora);
        animalShelter.enqueue(kari);
        animalShelter.enqueue(new Dog("Dexter"));
        animalShelter.enqueue(new Dog("Dobo"));
        animalShelter.enqueue(new Cat("Copa"));

        assertEquals(callie, animalShelter.dequeueAny());
        assertEquals(kiki, animalShelter.dequeueAny());
        assertEquals(fido, animalShelter.dequeueAny());

        animalShelter.enqueue(new Dog("Dapa"));
        animalShelter.enqueue(new Cat("Kilo"));

        assertEquals(kari, animalShelter.dequeueCats());
        assertEquals(dora, animalShelter.dequeueDogs());
    }

}
