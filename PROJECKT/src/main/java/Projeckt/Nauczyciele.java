package Projeckt;

import javafx.beans.property.SimpleStringProperty;

public class Nauczyciele {
	 private final SimpleStringProperty Imie;
	    private  SimpleStringProperty Nazwisko;
	    private  SimpleStringProperty Przedmiot;
	    private  String Staz;
	  
	    
	        public Nauczyciele( String Imie, String Nazwisko, String Przedmiot, String Staz )
	    {
	   
	    this.Imie =  new SimpleStringProperty(Imie);
	    this.Nazwisko = new SimpleStringProperty(Nazwisko);
	    this.Przedmiot = new SimpleStringProperty(Przedmiot);
	    this.Staz = new  String (Staz);

		   
		   
	   
	}
	        public String getImie()
	        {
	        return Imie.get();
	        
	        
	        }
	public String getNazwisko()
	{
	       return Nazwisko.get();

	}      
	        
	public String getPrzedmiot()
	{ return Przedmiot.get();         
	}        
	        
	public String getStaz()
	{
		return Staz; 
	}
	public void setImie(String value)
	{
	  Imie.set(value);


	} 
	public void setNazwisko(String value)
	{
	  Nazwisko.set(value);

	}      

	public void setSzkola(String value)
	{   Przedmiot.set(value);         
	}        

	public void setWiek(String value)
	{   
	}}
 
