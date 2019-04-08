package Baza;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Uczniowie")


public class Uczen {
public Uczen() {}


@DatabaseField(generatedId = true)
private int id;


@DatabaseField

private int pesel;

@DatabaseField
private String zachowanie; 
}
