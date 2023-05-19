package model.world;

import java.util.ArrayList;

import model.effects.Stun;

public class AntiHero extends Champion {

	public AntiHero(String name, int maxHP, int maxMana, int actions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, maxMana, actions, speed, attackRange, attackDamage);

	}

	@Override
	public void useLeaderAbility(ArrayList<Champion> targets) {
		for (Champion c: targets)
		{
			Stun s = new Stun(2);
			c.getAppliedEffects().add(s);
			s.apply(c);
		}
	}
	public String toString() {
		String s="Name: "+getName();
		s+="\nType: AntiHero";
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
