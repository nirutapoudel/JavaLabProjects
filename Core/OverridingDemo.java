package Core;

public class OverridingDemo {
    void display(){
        System.out.println("hello I am from OverridingDemo class");
    }
    public static void main(String[] args) {
        OverridingDemo overridingDemo= new OverridingDemo();
        OverridingDemo2 overridingDemo2=new OverridingDemo2();
        Demo3 demo3= new Demo3();
        overridingDemo.display();
        overridingDemo2.display();
        demo3.display();

    }
}
class OverridingDemo2 extends OverridingDemo{
    void display(){
        System.out.println("hello I am display function overrided by OverridingDemo2 class, My initial definition was in OverridingDemo Class");

    }
}
class Demo3 extends OverridingDemo {
    void display() {
        System.out.println("hello I am display function overrided by Demo3 class, My initial definition was in OverridingDemo Class and OverridingDemo2 class");

    }
}