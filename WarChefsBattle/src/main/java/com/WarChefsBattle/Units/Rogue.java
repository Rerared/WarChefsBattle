package com.WarChefsBattle.Units;

public class Rogue extends Unit {
	private int attack = 3;
	private int hp = 5;
	private String typeAttack = "MAG";
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
