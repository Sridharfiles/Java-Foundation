class Animal{
    void MakeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal{
    @Override
    void MakeSound(){
        System.out.println("cat meows");
    }
}
class cow extends Animal{
    @Override
    void MakeSound(){
        System.out.println("cow moos");
    }
}
class Dog extends Animal{
    @Override
    void MakeSound(){
        System.out.println("dog barks");
    }
}
public class animalsound {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new cow(), new Dog()};
        for (Animal animal : animals) {
            animal.MakeSound();
        }
    }
}
