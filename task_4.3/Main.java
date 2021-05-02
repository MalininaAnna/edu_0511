/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat sphinx = new Cat();
        sphinx.age = 3;
        sphinx.strength = 2;
        sphinx.weight = 5;
        Cat persian = new Cat();
        persian.age = 3;
        persian.strength = 1;
        persian.weight = 1;

        sphinx.fight(persian);
        persian.fight(sphinx);
        System.out.println((sphinx.fight(persian)));
        System.out.println((persian.fight(sphinx)));
        }
       }

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }
    public boolean fight(Cat anotherCat) {
        int win;
        win = 0;
         if (this.age > anotherCat.age) {
           win++;
        }
        if (this.weight > anotherCat.weight) {
           win++;
        }
        if (this.strength > anotherCat.strength) {
            win++;
        }
        if (win > 2)
            return true;
        if (win == 0)
           return false;
        return true;
    }
}
