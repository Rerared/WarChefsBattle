package com.WarChefsBattle.Units;

public class Paladin extends Unit{
	private int attack = 3;
	private int hp = 6;
	private String typeAttack = "PHYS";
	private String typeDefence = "MAG";
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
