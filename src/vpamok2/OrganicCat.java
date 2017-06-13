package vpamok2;

public class OrganicCat extends Cat implements OrganicPet {

	public OrganicCat(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam, int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam, hungerParam, thirstParam, wasteParam, oilLevelParam,chargeParam);

	}

	public OrganicCat(String nameParam, String descriptionParam) {
		super(nameParam, descriptionParam);
	}

	private int hunger;
	private int thirst;

	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger -= 10;
		happiness += 10;
		waste += 10;

	}

	public void water() {
		thirst -= 10;
		happiness += 10;
		waste += 10;
	}

}
