package dao;

import entity.Pet;

public interface IPetDAO {

	Pet getPetbyname(String name);

	Pet getPetbyage(int age);

	Pet getPetbybreed(String breed);

}
