public class Animals {

    protected String name, color;
    protected int  age, run, swim;
    static int count =0;

    Animals (String name, String color, int age, int run, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.swim = swim;
        count++;
    }

    void run (int run) {
        if (run <= this.run) {
            System.out.println(name + " пробежал " + run + " м");
        } else {
            System.out.println(name + " не потянет!");
         }
    }

    void swim (int swim) {
        if (swim <= this.swim) {
            System.out.println(name + " проплыл " + swim + " м");
        } else {
            System.out.println(name + " утонет!");
          }
    }
}
