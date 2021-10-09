package createAnAnimal;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
	private List<Animal> animalList = new ArrayList<Animal>(
			List.of(new Animal("Dog"), new Animal("Cat"), new Animal("Fish"), new Animal("Horse")));

	public List<Animal> getAnimalList() {
		return animalList;
	}
}
