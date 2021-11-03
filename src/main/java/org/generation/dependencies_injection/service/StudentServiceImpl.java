package org.generation.dependencies_injection.service;
import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{

    private List<Student> studentList=new ArrayList<Student>();

    public StudentServiceImpl(){
        addStudents();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);
    }

    @Override
    public List<Student> all() {
        return studentList;
    }

    @Override
    public Student findById(String id) {

        return studentList.get(Integer.parseInt(id));
    }

    private void addStudents(){
        studentList.add(new Student("1", 1, "Carlos Eduardo", "Jesus", 1 ));
        studentList.add(new Student("2", 2, "Rodrigo", "Leyva", 2 ));
        studentList.add(new Student("3", 3, "Marina", "Pardo", 3 ));
    }
}
