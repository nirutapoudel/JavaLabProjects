package Core.Abstraction;
// interface is 100% abstract while abstract class is 0-100% abstract.


public class InterfaceClass implements Demo {
    public static void main(String[] args) {
    Demo obj= new InterfaceClass();
    obj.display();
    }

    @Override
    public void display() {
        System.out.println("hello I am display(), an abstract function declared in interface Demo and defined in InterfaceClass");
    }

}
interface Demo{ // interface can have only abstract methods and static constants
    void display();



}
