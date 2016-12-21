package ua.kpi.tef.writer.model.human;

import java.util.Random;

public class Man implements Human{
	
	private Hand hand;
	private String[] thoughts = new String[]{"Hmm...", "Idea!","That's enough for today"};
	
	
	
	public Man(Hand hand, String[] thoughts) {
		this.hand = hand;
		this.thoughts = thoughts;
	}	
	
	public Man(Hand hand) {
		super();
		this.hand = hand;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	@Override
	public boolean isAbleToWrite() {
		// TODO Auto-generated method stub
		return hand != null && !hand.isBroken();
	}

	@Override
	public String compose() {
		// TODO Auto-generated method stub
		return thoughts[new Random().nextInt(thoughts.length)];
	}	
	
}
