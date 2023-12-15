package entity;

import exception.InsufficientFundsException;

public abstract class Donation {
	private static final double MIN_DONATION_AMOUNT = 0;
	private String donorName;
	private double amount;

	public Donation(String donorName, double amount) {
		this.setDonorName(donorName);
		this.amount = amount;
	}

	public abstract void recordDonation();

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void Donation1(String donorName, double amount) throws InsufficientFundsException {
		if (amount < MIN_DONATION_AMOUNT) {
			throw new InsufficientFundsException(donorName);
		}
		this.donorName = donorName;
		this.amount = amount;
	}
}
