package fr.emse.test;

public class Money {
	private int fAmount;
	private String fCurrency;
	public Money(int amount, String currency) {
	fAmount = amount;
	fCurrency = currency;
	}
	public int amount() {
	return fAmount;
	}
	public String currency() {
	return fCurrency;
	}
	public Money add(Money m) {
		if (m.currency().equals(currency())) {
			return new Money(amount() + m.amount(), currency());
		}	
		return new MoneyBag(this, m);
	}

}
