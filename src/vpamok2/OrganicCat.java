package vpamok2;

public class OrganicCat extends Cat implements OrganicPet {
	
	public OrganicCat(String nameParam, String descriptionParam){
		super(nameParam, descriptionParam);
	}
	public OrganicCat(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam, int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam, 60, 60, 50, 0, 0);

	}

	private int hunger;
	private int thirst;
	
	int getThirst() {
		return thirst;
	}

	int getHunger() {
		return hunger;
	}

	 public void feed() {
		hunger -= 10;
		happiness += 10;
		
	}

	 public void water() {
		thirst -= 10;
		happiness += 10;
	
	}
	 boolean isHungry()	{
			return hunger <25;
		}
		boolean isThirsty(){
			return thirst<25;
		}
}
