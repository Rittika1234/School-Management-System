package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher isha = new Teacher(2,"Isha",700);
        Teacher rittika = new Teacher(3,"Rittika",600);

        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(isha);
        teacherList.add(rittika);


        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshit",12);
        Student rishu = new Student(3,"Rishu",5);


        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rishu);

        School dps = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        dps.addTeacher(megan);


        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("DPS has earned $"+ dps.getTotalMoneyEarned());

        System.out.println("-----Making SCHOOL PAY SALARY------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("DPS has spent for salary to " + lizzy.getName()+" and now has $" + dps.getTotalMoneyEarned());

        rittika.receiveSalary(rittika.getSalary());
        System.out.println("DPS has spent for salary to " + rittika.getName() +
                " and how has $" + dps.getTotalMoneyEarned());

        System.out.println(rakshith);

        isha.receiveSalary(isha.getSalary());

        System.out.println(isha);
    }
}
