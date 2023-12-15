package dao;

import entity.Donation;

public interface IDonationDAO {

	Donation getDonationbydonorName(String donorName);

	Donation getDonationbydonoramount(double amount);

}
