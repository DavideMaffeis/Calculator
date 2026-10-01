package se_unibg.it.calculator;


public class Mecca {
	private int anni;
	public Mecca() {
		this.anni = 10;
	}
	
	public int getAnni() {
		return this.anni;
	}
	
	public String calcolaMaggiorenne() {
		if (this.anni <18) {
			return "non sei maggiorenne";
		}
		return "sei un bambino grande";
	}
}
