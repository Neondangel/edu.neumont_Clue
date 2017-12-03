package rosado.jose.csc110;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
//	Cards suspects = new Cards();
//	
//	Cards weapons = new Cards();
//	
//	Cards rooms = new Cards();
//	
//	ArrayList<Cards> cards = new ArrayList<>();

	/*
	 * These three lists will be made as cards for their respective type
	 * Within the Game class is where the first sorting starts
	 * First Rooms need to be allocated
	 * Weapons will be randomly assigned to one room
	 * A card from each list will be chosen as classified
	 * Those chosen cards will be removed and the remaining cards...
	 * ...will be shuffled to the players into a new list called hand
	 */
	
	private Random gen = new Random();
	
	public ArrayList<String> fullList = new ArrayList<>();
	
	public ArrayList<String> confidential = new ArrayList<>();	
	
	private ArrayList<String> suspectCards = new ArrayList<>();
	private void setSuspectCards() {
		suspectCards.add("Miss_Scarlet");
		suspectCards.add("Mrs_White");
		suspectCards.add("Mrs_Peacock");
		suspectCards.add("Colonel_Mustard");
		suspectCards.add("Professor_Plum");
		suspectCards.add("Mr_Green");
	}
	
	private ArrayList<String> weaponCards = new ArrayList<>();
	private void setWeaponCards() {
		weaponCards.add("Rope");
		weaponCards.add("LeadPipe");
		weaponCards.add("Knife");
		weaponCards.add("Wrench");
		weaponCards.add("CandleStick");
		weaponCards.add("Pistol");
	}
	
	private ArrayList<String> roomCards = new ArrayList<>();
	private void setRoomCards() {
		roomCards.add("Study");
		roomCards.add("Hall");
		roomCards.add("Lounge");
		roomCards.add("Library");
		roomCards.add("DiningRoom");
		roomCards.add("BilliardRoom");
		roomCards.add("Conservatory");
		roomCards.add("BallRoom");
		roomCards.add("Kitchen");
	}
	
	
	public void choseConfidential() {
		setSuspectCards();
		setWeaponCards();
		setRoomCards();
		
		// These will choose what card will be set as the confidential card by using a random number from the deck and then removing it
		setConfidentialCards(generateNumber(suspectCards), suspectCards);
		setConfidentialCards(generateNumber(weaponCards), weaponCards);
		setConfidentialCards(generateNumber(roomCards), roomCards);
		setFullList();
	}
	
	public int generateNumber(ArrayList<String> currentList) {
		int max = currentList.size();
		int min = 1;
		return gen.nextInt(max + 1 - min);
	}
	
	private void setConfidentialCards(int i, ArrayList<String> currentList) {
		confidential.add(currentList.get(i));
		currentList.remove(i);
		
		//Test
//		System.out.println(confidential);
	}
	
	private void setFullList() {
		fullList.addAll(suspectCards);
		fullList.addAll(weaponCards);
		fullList.addAll(roomCards);
	}
}
