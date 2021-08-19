public class Cat extends Animals {

    static int count =0;

    public Cat(String name, String color, int age) {
        super(name, color, age, 200, 0);
        count++;
    }

    @Override
    void swim (int swim) {
        System.out.println("Коты не умеют плавать!");
    }
}
