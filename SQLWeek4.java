package createAnAnimal;

import java.util.List;

public class SQLWeek4 {

	public static void main(String[] args) {
		SortedAnimalList sortedAnimalList = new SortedAnimalList();

		System.out.println("Sorted By Lambda");
		System.out.println("================");
		List<Animal> animalsSortedByLambda = sortedAnimalList.getAnimalsSortedByLambda();
		animalsSortedByLambda.forEach(animal -> System.out.println(animal.name));
		System.out.println("\n");

		System.out.println("Sorted By Method Reference");
		System.out.println("==========================");
		List<Animal> animalsSortedByMethodReference = sortedAnimalList.getAnimalsSortedByMethodReference();
		animalsSortedByMethodReference.forEach(animal -> System.out.println(animal.name));
		System.out.println("\n");

		System.out.println("Sorted String Stream");
		System.out.println("====================");
		AnimalStream animalStream = new AnimalStream();
		animalStream.printAnimalStream();
		System.out.println("\n");

		System.out.println("Optional Animal");
		System.out.println("===============");
		AnimalOptional animalOptional = new AnimalOptional();
		animalOptional.b();
		System.out.println("\n");
	}
}