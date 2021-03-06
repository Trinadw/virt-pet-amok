package vpamok2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VPShellter {
	public int shelterLitterbox;
	
	 void setShelterLitterbox(){
		shelterLitterbox=50;
	}
	
	public int getShelterLitterbox(){
		return shelterLitterbox=50;
	}
	public void cleanShelterLitterBox() {
		shelterLitterbox = 0;
	}
	
	Map<String, VirtPet> petMap = new HashMap<String, VirtPet>();
	Map<String, OrganicPet> organicDog = new HashMap<String, OrganicPet>();
	Map<String, OrganicPet> organicCat = new HashMap<String, OrganicPet>();
	Map<String, RoboticPet> roboticCat = new HashMap<String, RoboticPet>();
	Map<String, RoboticPet> roboticDog = new HashMap<String, RoboticPet>();
	Map<String, OrganicPet> comboOrganicPet = new HashMap<String, OrganicPet>();

	
	public void organicPetMap(String name, VirtPet pet){
		comboOrganicPet.putAll(organicCat);
		comboOrganicPet.putAll(organicDog);
	}
	// public void intakePets(String name, VirtPet pet){
	// petMap.put(pet.name, pet);

	// } 
	//add organic pets to shelter map and organic maps
	public void intakeOrganicPets(String name, VirtPet pet) {
		petMap.put(pet.name, pet);
		if (pet instanceof OrganicCat) {
			organicCat.put(pet.name, (OrganicPet) pet);
		}
		if (pet instanceof OrganicDog) {
			organicDog.put(pet.name, (OrganicPet) pet);
		}
	}
	//add robotic pets to shelter map and robotic maps
	public void intakeRoboticPets(String name, VirtPet pet) {
		petMap.put(pet.name, pet);
		if (pet instanceof RoboticCat) {
			roboticCat.put(pet.name, (RoboticPet) pet);
		}
		if (pet instanceof RoboticDog) {
			roboticDog.put(pet.name, (RoboticPet) pet);
		}
	}

	public Collection<VirtPet> pets() {
		return petMap.values();
	}
	//combo list of organic pets
	//public Collection<OrganicPet> dogs() {
		//return comboOrganicPet.values();
		
	//}

	public void playWith(VirtPet petName) {
		petName.play();
	}

	// get pets based on their name
	public VirtPet getPets(String name) {
		return petMap.get(name);
	}

	// method to remove pets when they are adopted
	public void adoptPet(VirtPet pet) {
		petMap.remove(pet);
		if (pet instanceof RoboticDog) {
			roboticDog.remove(pet.name, pet);
		}
		if (pet instanceof RoboticCat) {
			roboticCat.remove(pet.name, pet);
		}
		if (pet instanceof OrganicDog) {
			organicDog.remove(pet.name, pet);
		}
		if (pet instanceof OrganicCat) {
			organicCat.remove(pet.name, pet);
		}

	}
//method to feed organic pets only
	public void feedPets() {
		for (OrganicPet currentPet : organicDog.values()) {
			currentPet.feed();
		}

		for (OrganicPet currentPet : organicCat.values()) {
			currentPet.feed();
		}
	}
//method to water organic pets only
	public void waterPets() {
		for (OrganicPet currentPet : organicDog.values()) {
			currentPet.water();
		}

		for (OrganicPet currentPet : organicCat.values()) {
			currentPet.water();
		}
	}
//method to oil pets
	public void oilPets() {
		for (RoboticPet currentPet : roboticDog.values()) {
			currentPet.addOil();
		}
		for (RoboticPet currentPet : roboticCat.values()) {
			currentPet.addOil();
		}
	}
//method to charge pets batteries
	public void chargePets() {
		for (RoboticPet currentPet : roboticDog.values()) {
			currentPet.chargeBattery();
		}
		for (RoboticPet currentPet : roboticCat.values()) {
			currentPet.chargeBattery();
		}
	}
//method to clean dog cages
	public void cleanCages() {
		for (RoboticPet currentPet : roboticDog.values()) {
			((Dog) currentPet).cleanCage();
		}
		for (OrganicPet currentPet : organicDog.values()) {
			((Dog) currentPet).cleanCage();
		}
	}
//method to clean litter boxes
	public void cleanLitterBoxes() {
		for (RoboticPet currentPet : roboticCat.values()) {
			((Cat) currentPet).cleanLitterBox();
		}
		for (OrganicPet currentPet : organicCat.values()) {
			((Cat) currentPet).cleanLitterBox();
		}
	}//method to walk all dogs
public void walkDogs(){
	for(RoboticPet currentPet:roboticDog.values()){
		((Dog) currentPet).walk();
	}
	for(OrganicPet currentPet:organicDog.values()){
		((Dog) currentPet).walk();
	}
}
	// tick to affect all pets in shelter
	public void tickShelter() {
		for (VirtPet newTick : petMap.values()) {
			newTick.tick();
			shelterLitterbox+=10;

		}
	}
	
	
	}

