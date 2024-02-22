package ua.lviv.lga.lesson19.task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Petro1", 111111, 1111.11);

        Employee employee2;
        Methods met = null;

        File file1 = new File("emploeeinfo.txt");

        met.serialize(file1, employee);
        System.out.println("Info befor write to emploeeinfo.txt \n " + employee);
        employee2 = (Employee) met.deserialize(file1);
        System.out.println("Info after read from emploeeinfo.txt \n " + employee2);


        File file2 = new File("emploelist.txt");

        List<Employee> emplList = new ArrayList<Employee>();
        List<Employee> emplList2 = new ArrayList<Employee>();

        emplList.add(new Employee("Petro2", 222222, 2222.22));
        emplList.add(new Employee("Petro3", 333333, 3333.33));
        emplList.add(new Employee("Petro4", 444444, 4444.44));

        System.out.println("List befor write to emploelist.txt \n " + emplList);

        met.serialize(file2, (Serializable) emplList);

        emplList2 = (List<Employee>) met.deserialize(file2);

        System.out.println("List after read from emploelist.txt \n " + emplList2);
    }

}
