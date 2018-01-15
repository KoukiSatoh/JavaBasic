package practice13.common;

public class SuperHero extends Hero{
	Item equipment;
	
	
	@Override
	public int attack() {
		return this.power + equipment.additionalDamagee;
	}

	// ↓equipmentのアクセサ
	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}


}
