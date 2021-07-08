package chapter9;

public class Person {  //SERVING as SUPERCLASS

    private String name;
    private int age;
    private String gender;

    public Person(){ //built in--do not have to create it
        System.out.println("In Person default constructor");
    }

    public Person(String name){//this is a constructor
        System.out.println("In Person 2nd constructor. Name is set!!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
