package vpamok2;

import java.util.Scanner;

public class VPShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VPShellter petShelter = new VPShellter();// virtual pet
													// shelter
													// object
		// create pet providing name, description, type and species
		VirtPet albie = new VirtPet("Albie", "happy", "robotic", "dog");
		VirtPet lewis = new VirtPet("Lewis", "nervous", "robotic", "cat");
		VirtPet jax = new VirtPet("Jax", "shy", "organic", "cat");
		VirtPet gonzo = new VirtPet("Gonzo", "loud", "organic", "dog");
		// adding the pets to the map
		petShelter.intakeRoboticPets("Albie", albie);
		petShelter.intakeRoboticPets("Lewis", lewis);
		petShelter.intakeOrganicPets("Jax", jax);
		petShelter.intakeOrganicPets("Gonzo", gonzo);
		

		writeLine(
				"Welcome to John's Virtual Pet Shelter. Here are our current pets: \nName \tDescription \tType \tSpecies \tHappiness"
						+ albie + lewis + jax + gonzo);
		boolean begin = false;
		while (!begin) {// will allow the game to continue until the user
						// selects quit
			writeLine(
					"What would you like to do next? \n1. Feed the pets \n2. Water the pets \n3. Play with a pet \n4. Adopt a pet \n5. Admit a pet \n6. Walk all dogs \n7. Clean the dog cages \n8. Clean the shelter litterbox \n9. Oil the robotic pets \n10. Charge the robotic pets \n11. Quit");
			int toDo = input.nextInt();
			input.nextLine();
			switch (toDo) {
			case 1:
				petShelter.feedPets();// feeds all pets
				writeLine("The pets appreciate the grub!");
				break;
			case 2:
				petShelter.waterPets();// waters all the pets
				writeLine("The pets were parched, thanks!");
				break;
			case 3:
				writeLine("Which of our pets would you like to play with?");
				for (VirtPet somePet : petShelter.pets()) {
					writeLine(somePet.name + " is " + somePet.description);// provides
																			// name
																			// and
																			// description
																			// for
																			// all
																			// pets
																			// in
																			// shelter
				}
				String playName = input.nextLine();
				VirtPet tempPlay = petShelter.getPets(playName);// gets the pet
																// for the user
																// to play with
				petShelter.playWith(tempPlay);// adjusts pets boredom level
				writeLine(playName + " will adore playing with you.");
				break;
			case 4:
				writeLine("Which of our pets would you like to take home with you?");
				for (VirtPet petAdopt : petShelter.pets()) {
					writeLine(petAdopt.name + " is " + petAdopt.description);// provides
																				// name
																				// &
																				// description
																				// for
																				// all
																				// pets
																				// in
																				// shelter

				}
				String adoptName = input.nextLine();
				VirtPet tempAdopt = petShelter.getPets(adoptName);// gets the
																	// pet for
																	// the user
																	// to adopt
				petShelter.adoptPet(tempAdopt);// removes pet from map
				writeLine("Thank you for adopting " + adoptName + ". We know you will be pleased with your selection.");

				break;
			case 5:// admit a pet
				writeLine("Please provide us with the pet's name:");
				String getPetName = input.nextLine();
				writeLine("Please provide us with a one word description of the pet's demeanor:");
				String getPetDescription = input.next();
				writeLine("Please provide the pets overall health/happiness on a scale of 1-100:");
				int getPetHappiness=input.nextInt();
				writeLine("Is this a robotic or organic pet?");
				String getPetType = input.nextLine();
				if (getPetType.equalsIgnoreCase("organic")) {//used to determine which map the input will be placed in
					writeLine("Is this a dog or cat?");
					String getPetSpecies = input.nextLine();
					if (getPetSpecies.equalsIgnoreCase("dog")) {
						OrganicPet admitPets = new OrganicDog(getPetName, getPetDescription, getPetType, getPetSpecies, getPetHappiness);
						petShelter.intakeOrganicPets(getPetName, (VirtPet) admitPets);
					} else if (getPetSpecies.equalsIgnoreCase("cat")) {
						OrganicPet admitPets = new OrganicCat(getPetName, getPetDescription, getPetType, getPetSpecies, getPetHappiness);
						petShelter.intakeOrganicPets(getPetName, (VirtPet) admitPets);
					}
					// writeLine("We will try our best to find" + getPetName + "
					// a new home.");
				}
				if (getPetType.equalsIgnoreCase("robotic")) {
					writeLine("Is this a dog or cat?");
					String getPetSpecies = input.next();
					if (getPetSpecies.equalsIgnoreCase("dog")) {
						RoboticPet admitPets = new RoboticDog(getPetName, getPetDescription, getPetType, getPetSpecies, getPetHappiness);// creates
																														// new
																														// virtual
																														// pet
																														// with
																														// user
																														// input
						petShelter.intakeRoboticPets(getPetName, (VirtPet) admitPets);
					} else if (getPetSpecies.equalsIgnoreCase("cat")) {
						RoboticPet admitPets = new RoboticCat(getPetName, getPetDescription, getPetType, getPetSpecies, getPetHappiness);
						petShelter.intakeOrganicPets(getPetName, (VirtPet) admitPets);
					} // adds the pet to the organic shelter map
					writeLine("We will try our best to find " + getPetName + " a new home.");
				}

				break;
			case 6:
				petShelter.walkDogs();// walks all the dogs
				writeLine("The dogs will love going for a walk, thanks!");
				break;
			case 7:
				petShelter.cleanCages();// clean all the dog cages
				writeLine("We appreciate your help cleaning the dog cages!");
				break;
			case 8:
				petShelter.cleanLitterBoxes();// clean all cat litterboxes
				writeLine("We appreciate your help cleaning the shelter litter box!");
				break;
			case 9:
				petShelter.oilPets();// oil all robotic pets
				writeLine("Thanks for oiling our robotic pets!");
				break;
			case 10:
				petShelter.chargePets();// charge all the robotic pets
				writeLine("Thanks for charging our robotic pets!");
				break;

			case 11:
				writeLine("Wish you could stay longer. Enjoy your day.");
				System.exit(0);// allows the user to end the game
			default:
				writeLine("That is not a valid entry");
				continue;
			}
			
				
			}
			petShelter.tickShelter();//adjust waste and happiness
			System.out.println(petShelter.petMap);// prints shelter map
	
		}	
	

	public static void writeLine(String message) {
		System.out.println(message);
	}
}
