package codewars.streams;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private List<String> hobbies;

    public Person(String name, String surname, Integer age, ArrayList<String> hobbies) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String toString(){
        String retString = this.name +" "+ this.surname + ", "+ this.age.toString() +"yo, " + this.hobbies.toString() +"   ";
        return retString;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
