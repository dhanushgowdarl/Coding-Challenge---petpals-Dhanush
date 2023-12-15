package entity;

public class Cats extends Pet {
	String catColour;

	public Cats() {

	}

	public Cats(String catColour) {
		this.catColour = catColour;
	}

	public String getCatColour() {
		return catColour;
	}

	public void setCatColour(String catColour) {
		this.catColour = catColour;
	}

}
