package Core.Solution;

public abstract class Person {
        String name;
        String phone;
        String address;
        String email;
        public static void main(String[] args) {

            Student student = new Student(1,"Ram");
            System.out.println(student.toString());
            Employee employee = new Employee("Pokhara Office","2020 March 02","Shyam");
            System.out.println(employee.toString());
        }


    }
    class Student extends Person{

        final String  status[]={"Fresher","Sophomore","Junior","Senior"};
        Student(int index,String name){
            String status = this.status[index];
            this.name=name;
        }
        @Override
        public String toString(){
            return ("ClassName: "+ this.getClass().getName()+" PersonName: "+name);
        }

    }
    class Employee extends Person{
        String office;
        String dateHired;
        Employee(String office,String dateHired,String name){
            this.dateHired=dateHired;
            this.office=office;
            this.name= name;
        }
        @Override
        public String toString(){
            return ("ClassName: "+ this.getClass().getName()+" PersonName: "+name);
        }


    }
