package vpamok2;

public class OrganicDog extends Dog implements OrganicPet {
	int hunger;
	int thirst;
	
	public OrganicDog(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam, int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam, hungerParam, thirstParam, wasteParam, oilLevelParam, chargeParam);
		
	}
	public OrganicDog(String nameParam, String descriptionParam){
		super(nameParam, descriptionParam);
	}
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;}
	
	public void feed(){
		hunger-=10;
		happiness+=10;
		waste+=5;
		
	}
	public void water(){
		thirst-=10;
		happiness+=10;
		waste+=5;

		
	}

	
}
