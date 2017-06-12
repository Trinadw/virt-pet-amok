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

	void tick() {
		happiness -= num.nextInt(5);
		waste -= num.nextInt(5);

	}

	public VirtPet(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam) {
		name = nameParam;
		description = descriptionParam;
		type = typeParam;
		species = speciesParam;
		happiness = 70;
	}

	int getHappiness() {
		return happiness;
	}

	public VirtPet(String nameParam, String descriptionParam, String typeParam, String speciesParam) {
		name = nameParam;
		description = descriptionParam;
		type = typeParam;
		species = speciesParam;
	}

	public String pet() {
		return name + description;
	}

	@Override
	public String toString() {
		return "\n" + name + "\t" + description + "\t" + "\t" + type + "\t" + species + "\t" + happiness;
	}

	public void play() {
		happiness += 10;

	}
}
