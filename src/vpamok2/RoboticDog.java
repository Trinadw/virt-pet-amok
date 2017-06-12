package vpamok2;

public class RoboticDog extends Dog implements RoboticPet {
	
	public RoboticDog(String nameParam, String descriptionParam){
		super(nameParam, descriptionParam);
	}

	public RoboticDog(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam, int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam, 0, 0, 50, 75, 60);
		
	}
	
int oilLevel;//used to increase/decrease. signify needs more
int batteryLevel;//battery  level, used to increase/decrease signify need charge

int getoilLevel() {
	return oilLevel;
}

int getbatteryLevel() {
	return batteryLevel;
}
	public void addOil() {
		oilLevel+=10;
	}

	public void chargeBattery(){
		batteryLevel+=10;
	}


}
