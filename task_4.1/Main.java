/
Помогите коту обрести имя с помощью метода setName.
Требования:
•	Класс Cat должен содержать только одну переменную name.
•	Переменная name должна иметь модификатор доступа private и тип String.
•	Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
*/
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Безымянный кот");
        System.out.println(cat.setName("Имя кота"));
    }
}

class Cat {
    private String name = "безымянный кот";

    public String setName(String name){
        return (this.name = "Барсик");
    }
    public boolean getName(){
        return false;
    }
}
