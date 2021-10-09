package createAnAnimal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalStream {

	public void printAnimalStream() {
		AnimalList animalList = new AnimalList();
		List<Animal> animalStreamList = animalList.getAnimalList();
		Stream<Animal> animalStream = animalStreamList.stream();
		Stream<String> animalStringStream = animalStream.map(animal -> animal.toString());
		Stream<String> sortedAnimalStringStream = animalStringStream.sorted();
		String sortedAnimalString = sortedAnimalStringStream.collect(Collectors.joining(", "));
		System.out.println(sortedAnimalString);
	}
}
