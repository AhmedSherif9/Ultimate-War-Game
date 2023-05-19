package model.world;

import java.util.ArrayList;

import model.effects.Effect;
import model.effects.EffectType;
import model.effects.Embrace;

public class Hero extends Champion {

	public Hero(String name, int maxHP, int maxMana, int actions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, maxMana, actions, speed, attackRange, attackDamage);

	}

	@Override
	public void useLeaderAbility(ArrayList<Champion> targets) {
		for (Champion c : targets) {
			int i = 0;
			while (i < c.getAppliedEffects().size()) {
				Effect e = c.getAppliedEffects().get(i);
				if (e.getType() == EffectType.DEBUFF) {
					e.remove(c);
					c.getAppliedEffects().remove(e);

				} else
					i++;
			}
				Embrace em = new Embrace(2);
				
				em.apply(c);
				c.getAppliedEffects().add(em);
				
			}
		}
	public String toString() {
		String s="Name: "+getName();
		s+="\nType: Hero";
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

