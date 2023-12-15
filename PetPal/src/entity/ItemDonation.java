package entity;

class ItemDonation extends Donation {
	private String itemType;

	public ItemDonation(String donorName, double amount, String itemType) {
		super(donorName, amount);
		this.itemType = itemType;
	}

	@Override
	public void recordDonation() {
		System.out.println("Item Donation of " + itemType + " by " + getDonorName() + " amounting to $" + getAmount());
	}
}
