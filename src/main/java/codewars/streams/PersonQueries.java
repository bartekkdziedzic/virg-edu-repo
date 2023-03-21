package codewars.streams;

import java.util.*;
import java.util.stream.Collectors;

public class PersonQueries {

    public static List<Person> facebook;


    public static void init() {

        ArrayList p1List = new ArrayList<String>();
        ArrayList p2List = new ArrayList<String>();
        ArrayList p3List = new ArrayList<String>();
        ArrayList p4List = new ArrayList<String>();
        ArrayList p5List = new ArrayList<String>();
        ArrayList p6List = new ArrayList<String>();
        p1List.add("hobbyA");
        p1List.add("hobbyB");
        p2List.add("hobbyA");
        p3List.add("hobbyA");
        p3List.add("hobbyC");
        p3List.add("hobbyB");

        facebook = new ArrayList<>();
        facebook.add(new Person("Anna", "Annusewicz", 3,p1List ));
        facebook.add(new Person("Beata", "Borycka", 14, p2List));
        facebook.add(new Person("Cecylia", "Czarnecka", 25, p3List));
        facebook.add(new Person("Dominika", "Dudek", 36, p4List));
        facebook.add(new Person("Ewelina", "Elewi", 47,p5List));
        facebook.add(new Person("Faustyna", "Feddek", 58 ,p6List));
    }
//1
    public static Optional<Person> getSpecificPersonByNameSurname(String name, String surname) {

        return facebook.stream().filter(person -> person.getName().equals(name) && person.getSurname().equals(surname)).findFirst();
    }
//2
    public static Optional<Person> getOldestPerson() {

        return facebook.stream().max(Comparator.comparing(Person::getAge));
    }
//3
    public static Optional<String> getNameOfYoungestPerson() {

        return facebook.stream()
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getName);
    }
//4
    public static   List<Person> get30PlusList() {

       return facebook.stream()
               .filter(person -> person.getAge()>30).toList();
    }
//5
    public static   Double getAverageAge() {

        return facebook.stream()
                .collect(Collectors.averagingInt(age -> age.getAge()));
    }
//6
    public static   List <String> getNameList() {

        return facebook.stream()
                .map(Person::getName)
                .toList();

    }
//7
    public static   List <Person> getYoungestToOldestList() {

        return facebook.stream().sorted(Comparator.comparing(Person::getAge)).toList();

    }
//8
    public static List <String> getUniqueHobbies() {
//map
        return facebook.stream().flatMap(person -> person.getHobbies().stream()).distinct().collect(Collectors.toList());

    }
//9
    public static   List <Person> getAfter20MostHobbiesToLeastHobbies() {

        return facebook.stream()
                .filter(age -> age.getAge()>20)
                .sorted(Comparator.comparingInt(person -> person.getHobbies().size())).collect(Collectors.toList());

    }

//10
    public static   List <Person> getPeopleWithAdded10YearsAge() {

List <Person> newFacebook = facebook.stream()
        .map(age -> {
                age.setAge(age.getAge() + 10 );
                return age;
            })
        .collect(Collectors.toList());

        return newFacebook;
    }





    public static void main(String[] args) {
        init();
//1
        Optional<Person> testAnna =  getSpecificPersonByNameSurname("Anna","Annusewicz");
        testAnna.ifPresentOrElse(person -> System.out.println(person) , () -> System.out.println("not found") );
      // System.out.println(testAnna);
//2
        Optional<Person> testOldest =  getOldestPerson();
        testOldest.ifPresentOrElse(person -> System.out.println(person) , () -> System.out.println("not found") );
//3
        Optional<String> testName = getNameOfYoungestPerson();
        testName.ifPresentOrElse(person -> System.out.println(person) , () -> System.out.println("not found") );
//4
        List<Person> adultList = get30PlusList();
        System.out.println(adultList);
//5
        Double avrAge = getAverageAge();
        System.out.println(avrAge);
//6
        List<String> nameList = getNameList();
        System.out.println(nameList);
//7
        List<Person> youngestToOldestList = getYoungestToOldestList();
        System.out.println(youngestToOldestList);
//8
        List<String> uniqueHobbiesList = getUniqueHobbies();
        System.out.println(uniqueHobbiesList.toString());
//9
        List<Person> after20MostHobbiesToLeastHobbiesTest = getAfter20MostHobbiesToLeastHobbies();
        System.out.println(after20MostHobbiesToLeastHobbiesTest.toString());
//10
        List<Person> agePlus10YeastPeopleList = getPeopleWithAdded10YearsAge();
        System.out.println(agePlus10YeastPeopleList.toString());

    }




}
