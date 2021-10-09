package createAnAnimal;

import java.util.NoSuchElementException;
import java.util.Optional;

public class AnimalOptional {

	public Animal a(Optional<Animal> optionalAnimal) {
		return optionalAnimal.orElseThrow(() -> new NoSuchElementException("No Animal Present"));
	}

	public void b() {
		Animal animal = new Animal("The Bean");
		Optional<Animal> optionalAnimal = Optional.of(animal);
		System.out.println(a(optionalAnimal).toString());

		Optional<Animal> emptyOptionalAnimal = Optional.empty();
		try {
			System.out.println(a(emptyOptionalAnimal).toString());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
}
