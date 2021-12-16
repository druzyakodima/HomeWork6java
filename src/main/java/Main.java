public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat();
        Dog dogBobik = new Dog();


        dogBobik.run(500);
        catBarsik.run(100);
        catBarsik.getSwim();
        dogBobik.swim(10);

        Animal.printInfoCountAnimals();


    }
}
