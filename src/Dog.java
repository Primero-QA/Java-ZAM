public class Dog extends Animals {

    static int count =0;

    public Dog(String name, String color, int age) {
        super(name, color, age, 500, 10);
        count++;
    }
}
