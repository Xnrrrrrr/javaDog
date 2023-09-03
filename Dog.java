public class Dog {
    private String name;
    private int age;
    private DogBreeds breed;

    // Constructors
    public Dog(String name, int age, DogBreeds breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog(String name, DogBreeds breed) {
        this(name, 0, breed);
    }

    public Dog(DogBreeds breed) {
        this(null, breed);
    }

    //test

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DogBreeds getBreed() {
        return breed;
    }

    public void setBreed(DogBreeds breed) {
        this.breed = breed;
    }

    // Other methods
    public void bark() {
        System.out.println("Woof woof!");
    }
    public void asleep() {
        System.out.println("Zzzzzzzz.....");
    }

    public void playing() {
        System.out.println("Fetch!");
    }

}