public class Tiger {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Tiger (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate p) {
        satiety = p.decreaseFood(appetite);
        if (satiety) {
            System.out.println(this.name + " satisfied.");
        } else {
            System.out.println(this.name + " angry!");
        }
    }
}
