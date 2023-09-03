public class Main {
    public static void main(String[] args) {
        //3 Characteristics
        Dog snoopy = new Dog("Snoopy", 3, DogBreeds.CHIHUAHUA);
        //2 Characteristics
        Dog spot = new Dog("Spot", DogBreeds.BEAGLE);
        //1 Characteristics
        Dog wolf = new Dog(DogBreeds.HUSKY);


        //behavior outputs
        snoopy.bark();
        spot.bark();
        wolf.bark();
        snoopy.asleep();

        //spot set and get (age)
        spot.setAge(3);


        //wolf set and get (name, age)
        wolf.setName("Wolf");
        wolf.setAge(4);


        wolf.playing();


        //Outputs
        System.out.println(snoopy.getName() + " is a " + snoopy.getAge() + " year old " + snoopy.getBreed() + ".");
        System.out.println(spot.getName() + " is a " + spot.getAge() + " year old " + spot.getBreed() + ".");
        System.out.println(wolf.getName() + " is a " + wolf.getAge() + " year old " + wolf.getBreed() + ".");


    }
}