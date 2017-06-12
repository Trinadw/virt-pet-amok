package vpamok2;

public class RoboticCat extends Cat implements RoboticPet {

	public RoboticCat(String nameParam, String descriptionParam, String typeParam, String speciesParam) {
		super(nameParam, descriptionParam, typeParam, speciesParam);
		
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
