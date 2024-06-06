package org.example;

public class Employee implements Comparable<Employee>
{
    int age;
    double salary;
    String name;
    static int count=2;

    public Employee(int age, double salary, String name)
    {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public Employee()
    {
         age=7-count;
        salary=12000;
        name = "Chris";
        count--;
    }

    public int getAge()
    {
        return age;

    }

    public int compareTo(Employee f)
    {
        return this.age -f.age;

    }



    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
