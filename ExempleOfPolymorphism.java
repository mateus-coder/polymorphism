package polymorphism;

public class ExempleOfPolymorphism{
    public static void dogWillBark(TypesOfDogs breed){
        breed.bark();
    }
    public static void main(String[] args){
	     ExempleOfPolymorphism.dogWillBark(new AverageDog());
		  ExempleOfPolymorphism.dogWillBark(new SmallDog());
		  ExempleOfPolymorphism.dogWillBark(new BigDog());
	 }
} 