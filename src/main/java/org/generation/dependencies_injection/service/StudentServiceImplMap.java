package org.generation.dependencies_injection.service;
import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImplMap implements StudentService{

    HashMap<String, Student> hashStudent=new HashMap<>();

    public StudentServiceImplMap(){
        addstudents();
    }

    @Override
    public void add(Student student) {
    }

    @Override
    public void delete(Student student) {
        hashStudent.remove(student);
    }

    @Override
    public List<Student> all() {
        ArrayList<Student> studentList=new ArrayList<>(hashStudent.values());
        return studentList;
    }

    @Override
    public Student findById(String id) {
        return hashStudent.get(id);
    }

    private void addstudents(){
        hashStudent.put("1", new Student("1",1,"Carlos","Eduardo",10));
        hashStudent.put("2",new Student("2", 2, "Rodrigo", "Leyva", 2 ));
        hashStudent.put("3",new Student("3", 3, "Marina", "Pardo", 3 ));
    }
}
