package vpamok2;

public class OrganicCat extends Cat implements OrganicPet {
	

	public OrganicCat(String nameParam, String descriptionParam, String typeParam, String speciesParam, int happinessParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam);

	}

	int hunger;
	int thirst;
	
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
}
