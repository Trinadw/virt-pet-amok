package vpamok2;

public abstract class Cat extends VirtPet {
	
	public Cat(String nameParam, String descriptionParam){
		super(nameParam, descriptionParam);
	}
	public Cat(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam, int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam, hungerParam, thirstParam, wasteParam, oilLevelParam, chargeParam);

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
