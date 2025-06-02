package _31_Generic.WildCard.UpperBoundedWildCard;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        dogBox.setItem(new Dog());

        Box<Cat> catBox = new Box<>();
        catBox.setItem(new Cat());

        Box<Animal> AnimalBox = new Box<>();
        animalBox.setItem(new Animal());

//        Box<Date> dateBox = new Box<>(); 에러
//        dateBox.setItem(new Date());

        ExtensWildCard.makeSound(dogBox);
        ExtensWildCard.makeSound(dogBox);
        ExtensWildCard.makeSound(dogBox);
//        ExtensWildCard.makeSound(dateBox);

    }
}
