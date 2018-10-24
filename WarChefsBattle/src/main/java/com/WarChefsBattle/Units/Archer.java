package com.WarChefsBattle.Units;

public class Archer extends Unit {
	private int attack = 2;
	private int hp = 4;
	private String typeAttack = "PHYS";
	private String typeDefence = "PHYS";
	public int getAttack() {
		return attack;
	}
	public int getHp() {
		return hp;
	}
	public String getTypeAttack() {
		return typeAttack;
	}
	public String getTypeDefence() {
		return typeDefence;
	}
}
