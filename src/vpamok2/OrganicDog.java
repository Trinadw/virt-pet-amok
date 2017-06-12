package vpamok2;

public class OrganicDog extends Dog implements OrganicPet {
	int hunger;
	int thirst;
	public OrganicDog(String nameParam, String descriptionParam, String typeParam, String speciesParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam);
		
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
}
