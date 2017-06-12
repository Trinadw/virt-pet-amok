package vpamok2;

public abstract class Cat extends VirtPet {

	public Cat(String nameParam, String descriptionParam, String typeParam, String speciesParam, int happinessParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam);

	}

	private int waste;

	private int getWaste() {
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
