package model.world;

import java.util.ArrayList;

public class Villain extends Champion {

	public Villain(String name, int maxHP, int maxMana, int actions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, maxMana, actions, speed, attackRange, attackDamage);

	}

	@Override
	public void useLeaderAbility(ArrayList<Champion> targets) {
		for (Champion c : targets) {

			c.setCurrentHP(0);

		}

	}
	public String toString() {
		String s="Name: "+getName();
		s+="\nType: Villain";
		s+="\ncurrentHP: "+getCurrentHP();
		s+="\ncurrentActionPoints: "+getCurrentActionPoints();
		s+="\nmana: "+getMana();
		s+="\ncondition: "+getCondition();
		s+="\nattackRange: "+getAttackRange();
		s+="\nattackDamage:"+getAttackDamage();
		s+="\nspeed: "+getSpeed();
		return s;
	}

}
