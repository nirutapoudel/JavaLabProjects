package Core;

public class OverloadingDemo {
    public static void main(String[] args) {
        OverloadingDemo obj= new OverloadingDemo();
        obj.display();
        obj.display(5);
        System.out.println( obj.display(10, 15) );

    }
    void display(){ //first definition
        System.out.println("hello I am display with no return type and no parameters");

    }
    void display(int x){ // by changing the parameters or arguments
        System.out.println("hello I am display with one parameter and no return type");
        System.out.println("parameter is " +x);
    }
    String display(int x, int y){ // by changing return type and arguments
        return ("hello I am display with two parameters and a String return type and the arguments are "+x+ " and "+y);

    }
}

