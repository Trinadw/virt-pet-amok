package vpamok2;

public class Dog extends VirtPet {

	public Dog(String nameParam, String descriptionParam, String typeParam, String speciesParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam);

	}

	int waste;

	int getWaste() {
		return waste;
	}

	public void walk() {
		happiness += 10;
		waste -= 10;
	}

	public void addWaste() {
		waste += 5;
	}

	public void cleanCage() {
		waste = 0;
		happiness += 5;
	}

}
