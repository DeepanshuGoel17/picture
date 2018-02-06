package hackerrank;
import java.util.Scanner;

abstract class Animal {
    protected boolean isMammal;
    protected boolean isCarnivorous;
    
    public Animal(boolean isMammal, boolean isCarnivorous) {
        this.isMammal = isMammal;
        this.isCarnivorous = isCarnivorous;
    }
    
    public boolean getIsMammal() {
        return this.isMammal;
    }
    
    public boolean getIsCarnivorous() {
        return this.isCarnivorous;
    }
    
    abstract public String getGreeting();
    
    public void printAnimal(String name) {
        System.out.println( 
        	"A " + name + " says '" + this.getGreeting() 
            + "', is " + (this.getIsCarnivorous() ? "" : "not ") 
        	+ "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal."
        );
    }
}

class Dog extends Animal{
    
    Dog(){
        //super.isMammal = true;
        //super.isCarnivorous =true;
        super(true,true);
    }
    public String getGreeting(){
        return "ruff";
    }
    
    
}
class Cow extends Animal{
    Cow(){
         //super.isMammal = true;
        //super.isCarnivorous =false;
            super(true,false);  
    
    }
      public String getGreeting(){
        return "moo";
    }
}
class Duck extends Animal{
    Duck(){
         //super.isMammal = false;
        //super.isCarnivorous =false;
        super(false, false);
        
    }
      public String getGreeting(){
        return "quack";
    }
}
public class AnimalInheritance {
    
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.printAnimal("dog");
        	
        Animal cow = new Cow();
        cow.printAnimal("cow");

        Animal duck = new Duck();
        duck.printAnimal("duck");
    }
}
