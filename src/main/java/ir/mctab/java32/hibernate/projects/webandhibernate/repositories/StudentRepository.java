package ir.mctab.java32.hibernate.projects.webandhibernate.repositories;

import ir.mctab.java32.hibernate.projects.webandhibernate.config.hibernate.repositories.CrudRepository;
import ir.mctab.java32.hibernate.projects.webandhibernate.domain.Student;

public class StudentRepository extends CrudRepository<Student, Long> {
    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }

    private static StudentRepository studentRepository;

    private StudentRepository() {

    }

    public static StudentRepository getInstance() {
        if (studentRepository == null) {
            studentRepository = new StudentRepository();
        }
        return studentRepository;
    }
}
