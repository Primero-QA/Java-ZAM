public class MainClass {

    public static void main(String[] args) {
        Tiger[] arrTiger = new Tiger[3];
        String names[] = new String[]{"Bruno", "Nora", "Derill"};
        for (int i = 0; i < 3; i++) {
            arrTiger[i] = new Tiger(names[i], (int) ((Math.random() * (40 - 20)) + 20));
        }
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < 3; i++) {
            arrTiger[i].eat(plate);
        }
        plate.info();
        plate.addMeat(75);
        plate.info();
    }
}
