package Baza;

import com.j256.ormlite.field.DatabaseField;

public class Przedmioty {

	
	@DatabaseField(generatedId = true)
	private int id;
	public Przedmioty() {}

	 

	 

	@DatabaseField
	private int Matematyka; 
	@DatabaseField
	private int angielski; 
	@DatabaseField
	private int polski; 
	@DatabaseField
	private int informatyka; 
	@DatabaseField
	private int WF; 
	 
}
