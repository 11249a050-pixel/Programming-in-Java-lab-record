class Animal {
    void Sound (){
        System.out.println("Animal bmakes a sound");
    }
}
class Dog extends Animal {
    void Sound (){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void Sound (){
        System.out.println("Cat meows");
    }
}
class Cow extends Animal {
    void Sound (){
        System.out.println("Cow moos");
    }
}
public class geeks {
    public static void main(String[] args){
         Animal a;
         a = new Dog ();
         a.Sound ();
         a = new Cat ();
         a.Sound ();
         a = new Cow();
         a.Sound  ();
    }
}
