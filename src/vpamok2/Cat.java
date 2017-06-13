package vpamok2;

public abstract class Cat extends VirtPet {

	public Cat(String nameParam, String descriptionParam, String typeParam, String speciesParam, int happinessParam,
			int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam, hungerParam, thirstParam,
				wasteParam, oilLevelParam, chargeParam);

	}

	public Cat(String nameParam, String descriptionParam) {
		super(nameParam, descriptionParam);
	}

	protected int waste;

	public int getWaste() {
		return waste;
	}

	public void wasteImpact() {
		happiness-= 5;
	}

	public void cleanLitterBox() {
		waste = 0;
		happiness += 5;
	}

}
