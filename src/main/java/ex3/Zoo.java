package ex3;

import java.util.ArrayList;

public class Zoo {
	private String nom;
	private ArrayList<Animal> zoo;

	public Zoo(String nom, ArrayList<Animal> zoo){
		this.nom = nom;
		this.zoo = zoo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void addAnimal(Animal animal){
		this.zoo.add(animal);
	}

	public void afficherListeAnimaux(){
		this.zoo.forEach(System.out::println);
	}

	public int taille() {
		return this.zoo.size();
	}
}
