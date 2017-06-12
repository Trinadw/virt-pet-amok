package vpamok2;

public class Cat extends VirtPet {

	public Cat(String nameParam, String descriptionParam, String typeParam, String speciesParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam);

	}

	int waste;

	int getWaste() {
		return waste;
	}

	public void addWaste() {
		waste += 5;
	}

	public void cleanLitterBox() {
		waste = 0;
		happiness += 5;
	}

}
