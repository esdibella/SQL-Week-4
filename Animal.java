package createAnAnimal;

public class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + " Animal";
	}

	public static int compare(Animal animal1, Animal animal2) {
		return animal1.name.compareTo(animal2.name);
	}
}
