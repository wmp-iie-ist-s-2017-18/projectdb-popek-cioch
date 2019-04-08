package Baza;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Ocen Uczniów")
public class Oceny {

	public Oceny() {}


	@DatabaseField(generatedId = true)
	private int id_oceny;


	@DatabaseField

	private int pesel_ucznia;

	@DatabaseField
	private String przedmiot; 
	 
    @DatabaseField
	private String data_wystawienia; 
}
	
