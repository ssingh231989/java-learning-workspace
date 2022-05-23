package com.interview.practise;

import java.util.*;
import java.util.stream.Collectors;

class Emps implements Comparable<Emps> {
    private String name;
    private int salary;

    public Emps(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emps o) {
        return o.getSalary() - getSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emps{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


class Person {
    private String name;
    private int salary;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }l
}

class Student {
    private String fName;
    private String lName;

    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}

public class SecondHighestSalary {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        List<Person> lst = new ArrayList<>();
        lst.add(new Person("a", 1));
        lst.add(new Person("b", 2));
        lst.add(new Person("c", 3));

        Optional<Person> p1 = lst.stream().sorted(Comparator.comparingDouble(Person::getSalary).reversed()).skip(1).findFirst();
        System.out.println("p1" + p1);


        List<Person> lst1 = new ArrayList<>();
        lst1.add(new Person("a", 1));
        lst1.add(new Person("b", 2));
        lst1.add(new Person("c", 3));

        Comparator<Person> cp = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSalary() - p2.getSalary();
            }
        };

        Collections.sort(lst1, cp);

        lst1.stream().forEach(System.out::println);


        List<Person> lst2 = new ArrayList<>();
        lst2.add(new Person("a", 1));
        lst2.add(new Person("b", 2));
        lst2.add(new Person("c", 3));


        Collections.sort(lst2, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSalary() - p2.getSalary();
            }
        });

        int s = lst2.size() - 2;
        System.out.println("old" + lst2.get(s));


        System.out.println("----------");

        List<Emps> empsList = new ArrayList<>();

        empsList.add(new Emps("a", 101));
        empsList.add(new Emps("c", 103));
        empsList.add(new Emps("d", 104));
        empsList.add(new Emps("b", 102));
        Collections.sort(empsList);
        empsList.stream().forEach(System.out::println);


        /// sort with multiple value

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Sandeep", "A"));
        studentList.add(new Student("Sachin", "C"));
        studentList.add(new Student("Sandeep", "A"));
        studentList.add(new Student("Sachin", "B"));
        studentList.add(new Student("Sachin", "B"));

        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int val1 = o1.getfName().compareTo(o2.getfName());
                if (val1 == 0) {
                    int val2 = o1.getlName().compareTo(o2.getlName());
                    if (val2 == 0) {
                        return 0;
                    } else {
                        return val2;
                    }
                }
                return val1;
            }
        };
        Collections.sort(studentList, studentComparator);

        System.out.println("---------------------Student-----------");

        studentList.forEach(System.out::println);
        System.out.println("---------------------Student----lame-------");
        studentList.stream().map(st->st.getlName()).collect(Collectors.toList())
                .stream().forEach(System.out::println);
    }
}
