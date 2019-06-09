package Projeckt;

public class Oceny {
	 
		  
		    private  int Matematyka;
		    private  int j_polski;
		    private  int j_angielski;
		    private  int biologia;
		    private  int informatyka;
		    private  int geografia;
		    private  String zachowanie;
			  
		    
		        public Oceny (int matematyka,int j_Polski,int j_Angielski,int biologia, int informatyka,int geografia, String zachowanie )
		    {
		   
		    this.Matematyka =   matematyka;
		    this.j_polski = j_Polski;
		    this.j_angielski = j_Angielski;
		    this.biologia = biologia;
		    this.informatyka = informatyka;
		    this.geografia = geografia;
		    this.zachowanie = zachowanie;
		    

			   
			   
		   
		}
		        public int getMatematyka()
		        {
		        return Matematyka ;
		        
		        
		        }
		public int getj_polski()
		{
		       return j_polski;

		}      
		        
		public int getj_angielski()
		{ return j_angielski;         
		}        
		        
		public int getBiologia()
		{
			return biologia; 
		}
		public int getGeografia()
		{
			return geografia; 
		}
		public int getInformatyka()
		{
			return informatyka; 
		}
		public String getZachowanie()
		{
			 return zachowanie ;

		}
		 
	 

}
