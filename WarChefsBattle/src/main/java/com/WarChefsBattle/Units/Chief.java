package com.WarChefsBattle.Units;

import java.util.List;

import java.util.ArrayList;

public class Chief implements IChiefsActions {
	
	String name = "";

	int count_points = 10; 
	
	int pick_count = 1;  
	
	boolean can_deploy = true; 
	
	boolean can_pick = true; 
	
	Unit currentCard; 
	
	List<Unit> units = new ArrayList<>(); 
	
	List<Unit> tableCards = new ArrayList<>(); 
	
	public Chief(String name) {
		this.name = name;
	}
	
	public void skipTurn() {    
		
		can_deploy = false;
		count_points =+ 5;
		
		
	}

	public Unit pickCard() {
		
		if(can_pick != false) {
			currentCard = units.get(units.size()-1);
			units.remove(units.size()-1);
		}
		return currentCard;
	}


	public Unit deployCard(int card_id) {
		
		if(can_deploy !=false) {
			currentCard = tableCards.get(card_id);
			return currentCard;
		} 
			return null;
	}


}
