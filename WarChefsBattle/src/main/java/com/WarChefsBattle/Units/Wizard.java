package com.WarChefsBattle.Units;

public class Wizard extends Unit {
	private int attack = 4;
	private int hp = 2;
	private String typeAttack = "MAG";
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
