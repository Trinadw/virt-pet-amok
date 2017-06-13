package vpamok2;

public class RoboticDog extends Dog implements RoboticPet {
	
	

	public RoboticDog(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam, int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam, hungerParam, thirstParam, wasteParam, oilLevelParam, chargeParam);
		
	}
	public RoboticDog(String nameParam, String descriptionParam){
		super(nameParam, descriptionParam);
	}
	
int oilLevel;//used to increase/decrease. signify needs more
int batteryLevel;//battery  level, used to increase/decrease signify need charge

public int getOilLevel() {
	return oilLevel;
}

public int getBatteryLevel() {
	return batteryLevel;
}
	public void addOil() {
		oilLevel+=10;
	}

	public void chargeBattery(){
		batteryLevel+=10;
	}

void batteryLevel(){
	batteryLevel=30;
	
	
}
}
