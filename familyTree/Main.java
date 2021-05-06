//Создать родственников, вывести getInfo

public class Main {
    public static void main(String[] args) {
        int medKit = 50;
        Person dima = new Person("Дмитрий", 68, null, null);
        Person anna = new Person("Анна", 63, null, null);
        Person ivan = new Person("Иван", 65, null, null);
        Person nina = new Person("Нина", 60, null, null);
        Person oleg = new Person("Олег", 40, anna, dima);
        Person olga = new Person("Ольга", 35, nina, ivan);
        Person igor = new Person("Игорь", 13, olga, oleg);
        igor.getInfo();
        olga.getInfo();
        oleg.getInfo();

    }
}
class Person{
    private String name;
    private int age;
    private int hp = 100;
    private Person mother;
    private Person father;
    public Person(String name, int age, Person mother, Person father){
        this.name = name;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }
    public void getInfo(){
        String info = "Меня зовут "+this.name+"\n";
                if (this.mother != null) {
                    info += "Имя моей мамы: "+this.mother.name+"\n";
                }
                if (this.father != null) {
                    info += "Имя моего папы: "+this.father.name+"\n";
                }
                if (this.mother.mother != null) {
                    info += "У меня две бабушки: бабушка " + this.mother.mother.name+" и ";
                }
                if (this.father.mother != null) {
                    info += this.father.mother.name+"\n";
                }
                if (this.father.father != null) {
                    info += "У меня два дедушки: дедушка " + this.father.father.name+" и ";
                }
                if (this.mother.father != null) {
                    info +=this.mother.father.name+"\n";
                }
               System.out.println(info);
    }
        public String getName() {
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public Person getMother(){
        return this.mother;
    }
    public void setHp(int hp){
        if (this.hp+hp>100) this.hp = 100;
        else this.hp = this.hp + hp;
    }
}
