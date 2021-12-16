public class Animal {


    private static String animal;
    private int swim;
    private int run;
    private String name;

    private static int animalsCount = 0;

    public Animal(String animal, String name, int swim, int run) {
        this.animal = animal;
        this.name = name;
        this.swim = swim;
        this.run = run;

        animalsCount++;
    }

    public static String getAnimal() {
        return animal;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void run(int run) {
        int left = getRun() - run;
        if (run > getRun()) {
            System.out.printf("%s не может пробежать больше %d м", getName(), getRun());
        } else if (left == 0) {
            printInfoRun(run);
            System.out.println(name + " устал ,больше не побежит");
        } else {
            printInfoRun(run);
            System.out.printf("У %sa осталось сил на %d м\n", name, left);
        }
    }

    private void printInfoRun(int run) {
        System.out.printf("%s пробежал %d м \n", getName(), run);
    }

    public void swim(int swim) {
        int left = getSwim() - swim;
        if (getSwim() < swim) {
            System.out.printf("%s не может проплыть больше %d м\n", getName(), getSwim());
        } else if (left == 0) {
            printInfoSwim(swim);
            System.out.printf("%s устал, больше не поплывёт\n", getName());
        } else {
            printInfoSwim(swim);
            System.out.printf("У %s осталось сил на %d м \n", name, left);
        }

    }

    private void printInfoSwim(int swim) {
        System.out.printf("%s проплыл %d м \n", getName(), swim);
    }

    public static void printInfoCountAnimals() {
        System.out.printf("Всего животных %s, всего котов %s, всего собак %s", animalsCount, Cat.getCatCounts(), Dog.getDogCounts());
    }
}
