package com.dkit.gd2.johnloane;

import java.util.*;

/**
 * OOP CA3
 * @author Teodor Donchev
 */
public class App 
{
    public static void main( String[] args )
    {

        ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student(1,"David Jeferson",19);
        Student s2 = new Student(2,"Tom Samson",18);
        Student s3 = new Student(3,"John Armstrong",21);
        Student s4 = new Student(4,"Steve Padelton",22);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        //Question 1
        questionOnePartA(studentList);

       // questionOnePartB(studentList);

        //questionOnePartC(studentList);
       // questionOnePartD();

        //Question 2
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("John","Smith");
        Employee e2 = new Employee("Andrea","Collon");
        Employee e3 = new Employee("Derek","Riddle");
        Employee e4 = new Employee("Cory","Smith");
        Employee e5 = new Employee("Antoan","Champs");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        questionTwoPartA( employeeList);
        pickLuckyWinner(employeeList);
        questionTwoPartB(employeeList);
       // questionTwoPartC();
       // questionTwoPartD();

        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);
       // questionThreePartA(oneHundredStrings);
      //  questionThreePartB();

        //Question 4
        compareTwoStudents();
       questionFourPartA();
        questionFourPartB();
      //  questionFourPartC();
    }
    public static void questionOnePartA(ArrayList<Student> studentList){

        System.out.println("Student List");
        System.out.println("__________________________________________");

        for (Student student : studentList) {
            System.out.println(student);
        }

    }
    public static void questionOnePartB(ArrayList<Student> studentList){

         Student[] studentArray = studentList.toArray(new Student[0]);

         Arrays.sort(studentArray);
         System.out.println(studentArray);

        // ArrayList<Student> sortedstudentArray = new ArrayList<>(Arrays.asList(studentArray));
    }
    public static void questionOnePartC(ArrayList<Student> studentList){

    }
    public static void questionTwoPartA(List<Employee> employeeList) {
        System.out.println("\nEmployee List");
        System.out.println("__________________________________________");

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
    public static void  pickLuckyWinner(List<Employee> employeeList){
         Random random = new Random();

        int index = random.nextInt(employeeList.size());
        System.out.println("\nThe winner is  :" +employeeList.get(index)  );

    }

    public static void questionTwoPartB(List<Employee> employeeList){
        System.out.println("List iterator");

        Set<Employee> employee= new HashSet<>();





    }
    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }
    public static void questionFourPartA(){
        System.out.println("Because there no equals method implemented in the Student class");
    }
    public static void questionFourPartB(){
        System.out.println("Because there no hashCode method implemented in the Student class");
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }

}
