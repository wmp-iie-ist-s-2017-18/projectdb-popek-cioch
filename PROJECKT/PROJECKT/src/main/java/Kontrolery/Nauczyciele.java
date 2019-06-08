package Kontrolery;

 
public class Nauczyciele {
	String Imie;
	String Nazwisko;
	String Przedmiot;
	String Staz;
	  
	    
	        public Nauczyciele( String Imie, String Nazwisko, String Przedmiot, String Staz )
	    {
	   
	    this.Imie =  Imie;
	    this.Nazwisko = Nazwisko;
	    this.Przedmiot = Przedmiot;
	    this.Staz =    Staz;

		   
		   
	   
	}
	        public String getImie()
	        {
	        return Imie ;
	        
	        
	        }
	public String getNazwisko()
	{
	       return Nazwisko ;

	}      
	        
	public String getPrzedmiot()
	{ return Przedmiot ;         
	}        
	        
	public String getStaz()
	{
		return Staz; 
	}
	public void setImie(String Imie )
	{
	    this.Imie =  Imie;


	} 
	public void setNazwisko(String Nazwisko)
	{
	    this.Nazwisko = Nazwisko;

	}      

	public void setSzkola(String Przedmiot)
	{   	    this.Przedmiot = Przedmiot;
       
	}        

	public void setWiek(String Staz)
	{   
	    this.Staz =    Staz;

	}}
 
