public class Cat extends Animal {

    private static int catCounts = 0;

    public Cat() {
        super("Кот", "Барсик", 0, 200);
        catCounts++;
    }

    public static int getCatCounts() {
        return catCounts;
    }

    @Override
    public void run(int run) {
        super.run(run);
    }

    @Override
    public int getSwim() {
        System.out.printf("%s не умеет плавать\n", getName());
        return super.getSwim();
    }


}
