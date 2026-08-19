class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
 }
 class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
    }
 }
 class puppy extends Dog{
    void weep(){
        System.out.println("puppy is weeping");
    }
 }
 public class multilevelinheritance{
    public static void main(String[] args){
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.weep();
    }
 }
