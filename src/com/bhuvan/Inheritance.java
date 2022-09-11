package com.bhuvan;


class Person{
    int age;
    String name;
    Person(int a, String n){
        age=a;
        name=n;
    }
    void show(){
        System.out.println("from Person class" );
    }
}
class Employee extends Person{
    double salary;
    Employee(int age,String name, double sal){
        super(age, name);
        salary=sal;
    }
    void show(){
        super.show();
        System.out.println(age+" "+name+" "+salary);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Employee employee=new Employee(22,"Bhuvana krishna", 20000 );
        employee.show();

    }
}
