class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    void meows(){
        System.out.println("Cat is meowing");
    }
}
public class hierachicalinheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
        Cat c= new Cat();
        c.eat();
        c.meows();

    }
}
