package createAnAnimal;

import java.util.List;

public class SortedAnimalList {

	private AnimalList animalList = new AnimalList();

	public List<Animal> getAnimalsSortedByLambda() {
		List<Animal> animalsList = animalList.getAnimalList();
		animalsList.sort((animal1, animal2) -> Animal.compare(animal1, animal2));
		return animalsList;
	}

	public List<Animal> getAnimalsSortedByMethodReference() {
		List<Animal> animalsList = animalList.getAnimalList();
		animalsList.sort(Animal::compare);
		return animalsList;
	}
}
