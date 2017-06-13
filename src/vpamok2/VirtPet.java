package vpamok2;

import java.util.Random;

public class VirtPet {
	Random num = new Random();
	protected String name;
	// variables for my pet

	protected String description;
	protected int happiness;
	protected String type;
	protected String species;
	protected int waste;
	protected int hunger;
	protected int thirst;
	protected int oilLevel;
	protected int charge;

	void tick() {
		happiness -= num.nextInt(5);
		waste += num.nextInt(5);

	}

	public VirtPet(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam, int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		name = nameParam;
		description = descriptionParam;
		type = typeParam;
		species = speciesParam;
		happiness = happinessParam;
		waste=wasteParam;
		
	
		
	}

	int getHappiness() {
		return happiness;
	}

	public VirtPet(String nameParam, String descriptionParam) {
		name = nameParam;
		description = descriptionParam;
		
	}

	public String pet() {
		return name + description;
	}

	@Override
	public String toString() {
		return "\n" + name + "\t" + description + "\t" + "\t" + type + "\t" + species + "\t" + happiness + "\t"+ hunger+"\t"+thirst+ "\t"+ waste + "\t"+oilLevel+"\t"+charge;
	}

	public void play() {
		happiness += 10;
		oilLevel-=10;
		hunger+=10;
		charge-=10;

	}

	public String getName() {
		return name;
	}
	public int getWaste() {
		return waste;
	}
}
