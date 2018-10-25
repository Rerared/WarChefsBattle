package com.WarChefsBattle.Units;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class App 
{
    public static void main( String[] args )
    {
    	List <Unit> deck = generateDeck();
        for(Unit a : deck) {
            System.out.println(a.getClass().getSimpleName()+" hp:" + a.getHp() +
                    " attack:" + a.getAttack() + " type of defence:"+
                    a.getTypeDefence() + " type of attack:" + a.getTypeAttack());
        }

        Chief Warlord1 = new Chief("Pawd"); // инициализируем вождя
        
        Warlord1.units.addAll(deck); // заполняем деку
        
        System.out.println();
        System.out.print(Warlord1.units.size()); // for test checking size of Warlord units
        System.out.println();
        
        Warlord1.tableCards.add(Warlord1.pickCard()); // try use method pickCard(picking card from deck unts)
        Warlord1.tableCards.add(Warlord1.pickCard());
        
        for (Unit a : Warlord1.tableCards) { // Out to console card in hand
        	 System.out.println(a.getClass().getSimpleName()+" hp:" + a.getHp() +
                     " attack:" + a.getAttack() + " type of defence:"+
                     a.getTypeDefence() + " type of attack:" + a.getTypeAttack());
		}
    }
    
    
    public static List <Unit> generateDeck(){
        List<Unit> units = new ArrayList<Unit>();
       
        List<Unit> randoms = new ArrayList<Unit>();
        randoms.add(new Knite());
        randoms.add(new Archer());
        randoms.add(new Paladin());
        randoms.add(new Wizard());
        randoms.add(new Rogue());
        //card limits in the deck
        int knites = 2;
        int archers = 2;
        int paladins = 2;
        int wizards = 2;
        int rogues = 2;
        
 
      
        // if you dont need it, just simplify the execution condition for adding card
        // and numbers of loops is getting from limits + number of additional cards(there is 0 additional cards)
        for(int i = 0; i < 10; i++) {
            ListIterator<Unit> iter = randoms.listIterator();
            int numOfRandom = randoms.size();
            int temp = (int) (Math.random()*numOfRandom);//generate random digit from current size of "List randoms"
            String tempStr = randoms.get(temp).getClass().getSimpleName();//generate random unit's name
           
            if(tempStr.equals("Knite") && knites > 0) {
                units.add(new Knite());
                knites--;
                if(knites == 0) {
                    while(iter.hasNext()) {
                        if(iter.next().getClass().getSimpleName().equals("Knite")) {
                            iter.remove();
                            break;
                        }
                    }
                }
            }
            //same for Archer, Paladin, Wizard, Rogue.
            if(tempStr.equals("Archer") && archers > 0) {
                units.add(new Archer());
                archers--;
                if(archers == 0) {
                    while(iter.hasNext()) {
                        if(iter.next().getClass().getSimpleName().equals("Archer")) {
                            iter.remove();
                            break;
                        }
                    }
                }
            }
            if(tempStr.equals("Paladin") && paladins > 0) {
                units.add(new Paladin());
                paladins--;
                if(paladins == 0) {
                    while(iter.hasNext()) {
                        if(iter.next().getClass().getSimpleName().equals("Paladin")) {
                            iter.remove();
                            break;
                        }
                    }
                }
            }
            if(tempStr.equals("Wizard") && wizards > 0) {
                units.add(new Wizard());
                wizards--;
                if(wizards == 0) {
                    while(iter.hasNext()) {
                        if(iter.next().getClass().getSimpleName().equals("Wizard")) {
                            iter.remove();
                            break;
                        }
                    }
                }
            }
            if(tempStr.equals("Rogue") && rogues > 0) {
                units.add(new Rogue());
                rogues--;
                if(rogues == 0) {
                    while(iter.hasNext()) {
                        if(iter.next().getClass().getSimpleName().equals("Rogue")) {
                            iter.remove();
                            break;
                        }
                    }
                }
            }
        }
            return units;//generated deck
        }
    
    
}


