package vpamok2;

public abstract class Dog extends VirtPet {

	public Dog(String nameParam, String descriptionParam, String typeParam, String speciesParam,  int happinessParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam);

	}

	private int waste;

	private int getWaste() {
		return waste;
	}

	protected void walk() {
		happiness += 10;
		waste -= 10;
	}

	public void addWaste() {
		waste += 5;
	}

	protected void cleanCage() {
		waste = 0;
		happiness += 5;
	}

}
