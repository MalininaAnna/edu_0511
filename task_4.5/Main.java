/*4.5
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main {
    public static void main(String[] args) {
        Dog barbos = new Dog("Барбос",3,"Мясо",4);
        Horse star = new Horse("Звезда",5,"Овес жую",4,"Я хожу");
        Pegasus cloud = new Pegasus("Облако", 4,"Радугой питаюсь",4,"Я летаю");
        System.out.println(barbos.name);
        System.out.println(star.eat);
        System.out.println(cloud.limb);
        System.out.println(cloud.travel);
        System.out.println(star.travel);
        barbos.run();
        cloud.fly();
        star.run();
    }
}
class Animal {
        String name;
        int age;
        String eat;
        int limb;

        public Animal(String name, int age, String eat, int limb) {
            this.name = name;
            this.age = age;
            this.eat = eat;
            this.limb = limb;
        }
}
class Horse extends Animal {
    String travel;
    public Horse(String name, int age, String eat, int limb,String travel) {
        super(name, age, eat, limb);
        this.travel = travel;
        }
    public void run(){
        System.out.println("Игого, я поскакал(а)");
    }
}
class Pegasus extends Horse {
    public Pegasus(String name, int age, String eat, int limb, String travel) {
        super(name, age, eat, limb, travel);
        }
    public void fly() {
        System.out.println("Игого, я полетел(а)");
    }
}
class Dog extends Animal {
    public Dog(String name, int age, String eat, int limb) {
        super(name, age, eat, limb);
    }
    public void run() {
        System.out.println("Гав-Гав-Гав, я побежал(а)");
    }
}
