package vpamok2;

public class OrganicDog extends Dog implements OrganicPet {
	int hunger=50;
	int thirst=50;
	public OrganicDog(String nameParam, String descriptionParam, String typeParam, String speciesParam, int happinessParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam);
		
	}
	int getHunger() {
		return hunger;
	}

	int getThirst() {
		return thirst;}
	
	public void feed(){
		hunger-=10;
		happiness+=10;
		
	}
	public void water(){
		thirst-=10;
		happiness+=10;

		
	}
	boolean isHungry()	{
		return hunger <25;
	}
	boolean isThirsty(){
		return thirst<25;
	}
}
