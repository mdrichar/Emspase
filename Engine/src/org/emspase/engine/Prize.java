package org.emspase.engine;

public class Prize {
	protected int quantity;
	protected PrizeType prize;
	
	public Prize() {
		this.quantity = 1;
		this.prize = PrizeType.BLUE;
	}
	
	public Prize(int quantity, PrizeType prize) {
		this.quantity = quantity;
		this.prize = prize;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public PrizeType getPrize() {
		return prize;
	}
	public void setPrize(PrizeType prize) {
		this.prize = prize;
	}
}
