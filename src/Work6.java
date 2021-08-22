public class Work6 {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Маркиз", "рыжий", 2);
        Cat secondCat = new Cat("Ферзь", "белый", 4);
        Dog firstDog = new Dog("Полкан", "коричневый", 5);

        firstCat.run(20);
        secondCat.run(80);
        firstDog.run(600);
        firstCat.swim(1);
        firstDog.swim(5);
        System.out.println("Всего животных: " + Animals.count);
        System.out.println("Котов: " + Cat.count);
        System.out.println("Собак: " + Dog.count);
    }
}
