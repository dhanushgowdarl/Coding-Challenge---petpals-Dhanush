package entity;

class CashDonation extends Donation {
	private String donationDate;

	public CashDonation(String donorName, double amount, String donationDate) {
		super(donorName, amount);
		this.donationDate = donationDate;
	}

	@Override
	public void recordDonation() {
		System.out.println("Cash Donation recorded on " + donationDate + " by " + getDonorName() + " "
				+ "amounting to $" + getAmount());
	}
}
