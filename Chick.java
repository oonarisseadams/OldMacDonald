class Chick implements Animal 
{     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound)     
     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick(String cheep, String cluck)     
     {         
         myType = "chick";         
         if((Math.random()*1)> 0.5)
         {
           mySound = cheep;
         }
         else
         {
           mySound = cluck;
         }
           
     }      
     public String getSound()
     {
         return mySound;
     }     
     public String getType()
     {
         return myType;
     } 
}
