import ir.mctab.java32.hibernate.projects.webandhibernate.config.hibernate.HibernateUtil;
import ir.mctab.java32.hibernate.projects.webandhibernate.domain.Laptop;
import ir.mctab.java32.hibernate.projects.webandhibernate.domain.Student;
import ir.mctab.java32.hibernate.projects.webandhibernate.repositories.LaptopRepository;
import ir.mctab.java32.hibernate.projects.webandhibernate.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class TestLaptopRepository {

    public static void main(String[] args) {
        HibernateUtil.getSession();

        Laptop laptop3 = LaptopRepository
                .getInstance()
                .findById(3L);

        laptop3
                .getStudents()
                .stream()
                .map(student -> student.getFamily())
                .forEach(System.out::println);

        /*List<Student> students = new ArrayList<>();

        students
                .add(
                        StudentRepository.getInstance().findById(5L)
                );

        students
                .add(
                        StudentRepository.getInstance().findById(6L)
                );

        students
                .add(
                        StudentRepository.getInstance().findById(7L)
                );

        laptop3.setStudents(students);

        LaptopRepository
                .getInstance()
                .update(laptop3);*/


    }
}
