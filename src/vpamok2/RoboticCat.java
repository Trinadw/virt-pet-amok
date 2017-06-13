package vpamok2;

public class RoboticCat extends Cat implements RoboticPet {
	
	

	public RoboticCat(String nameParam, String descriptionParam, String typeParam, String speciesParam,
			int happinessParam, int hungerParam, int thirstParam, int wasteParam, int oilLevelParam, int chargeParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam,hungerParam, thirstParam, wasteParam, oilLevelParam,chargeParam);
	}
	public RoboticCat(String nameParam, String descriptionParam){
		super(nameParam, descriptionParam);
	}

	public int oilLevel;// used to increase/decrease. signify needs more
	public int batteryLevel;// battery level, used to increase/decrease signify
							// need charge

	public int getOilLevel() {
		return oilLevel = 60;
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void addOil() {
		oilLevel += 10;
	}

	public void chargeBattery() {
		batteryLevel += 10;
	}

}
