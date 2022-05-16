package Core.Abstraction;

public class AbstractClass extends Abs {


    public static void main(String[] args) {
        Abs obj= new AbstractClass();
        obj.show();
        obj.display();
        System.out.println(obj.rollNumber);

    }

    @Override
    void display() {
        System.out.println("I am display(), an abstract method declared in Abs class and is defined in AbstractClass");
    }
}
abstract class Abs{ //abstract cls can have variables, abstract methods and non-abstract methods
    int rollNumber= 21;
    abstract void display(); // abstract method declaration
    void show(){
        System.out.println("hello I am show(), a non-abstract method");
    }

}