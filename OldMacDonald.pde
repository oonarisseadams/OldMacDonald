public void setup() 
{     
    Cow c = new Cow("cow", "moo");
    Pig b = new Pig("pig", "oink");
    Chick a = new Chick("chick", "cluck");
    Farm d = new Farm();
    d.animalSounds();
    System.out.println(c.getType() + " goes " + c.getSound()); 
    System.out.println(b.getType() + " goes " + b.getSound()); 
    System.out.println(a.getType() + " goes " + a.getSound()); 
}
