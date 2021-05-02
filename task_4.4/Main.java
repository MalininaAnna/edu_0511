/* Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog spikeDog = new Dog("Спайк", "хищник", 3);
        Cat tomCat = new Cat("Том", "хищник",3);
        Person mammy = new Person("Два тапка","не на диете", 40);
        System.out.println(spikeDog.diet);
        System.out.println(tomCat.age);
        System.out.println(mammy.name);
        System.out.println(jerryMouse.height);
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}

class Dog {
    String name;
    String diet;
    int age;

    public Dog(String name, String diet, int age) {
        this.name = name;
        this.diet = diet;
        this.age = age;
    }
}

class Cat {
    String name;
    String diet;
    int age;

    public Cat(String name, String diet, int age) {
        this.name = name;
        this.diet = diet;
        this.age = age;
    }
}

class Person {
    String name;
    String diet;
    int age;

    public Person(String name, String diet, int age) {
        this.name = name;
        this.diet = name;
        this.age = age;
    }
}
