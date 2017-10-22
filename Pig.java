class Pig implements Animal 
{     
     public String myType;     
     public String mySound;   
     
     public Pig(String type, String sound)     
     {         
         myType = type;         
         mySound = sound;     
     }     
     public Pig()     
     {         
         myType = "pig";         
         mySound = "oink";     
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
