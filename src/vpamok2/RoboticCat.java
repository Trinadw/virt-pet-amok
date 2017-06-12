package vpamok2;

public class RoboticCat extends Cat implements RoboticPet {

	public RoboticCat(String nameParam, String descriptionParam, String typeParam, String speciesParam, int happinessParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam, happinessParam);
		
	}
	public int oilLevel;//used to increase/decrease. signify needs more
	public int batteryLevel;//battery  level, used to increase/decrease signify need charge

	public int getoilLevel() {
		return oilLevel;
	}
	
	public int getbatteryLevel() {
		return batteryLevel;
	}
		public void addOil() {
			oilLevel+=10;
		}

		public void chargeBattery(){
			batteryLevel+=10;
		}

}
