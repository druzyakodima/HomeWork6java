public class Dog extends Animal {

    private static   int dogCounts = 0;

    public Dog() {
        super("Собака", "Бобик", 10, 500);
        dogCounts++;
    }

    public static int getDogCounts() {
        return dogCounts;
    }

    @Override
    public void run(int run) {
        super.run(run);
    }
}

