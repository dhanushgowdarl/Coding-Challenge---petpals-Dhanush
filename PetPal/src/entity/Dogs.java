package entity;

public class Dogs extends Pet {
	String dogbreed;

	public Dogs() {

	}

	public Dogs(String dogbreed) {
		this.dogbreed = dogbreed;
	}

	public String getDogbreed() {
		return dogbreed;
	}

	public void setDogbreed(String dogbreed) {
		this.dogbreed = dogbreed;
	}
}
