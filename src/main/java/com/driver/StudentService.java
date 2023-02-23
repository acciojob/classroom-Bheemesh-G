package com.driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student)
    {
        studentRepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher)
    {
        studentRepository.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String sName,String tName)
    {
        studentRepository.addStudentTeacherPair(sName,tName);
    }

    public Student getStudentByName(String sName)
    {
        return studentRepository.getStudentByName(sName);
    }

    public Teacher getTeacherByName(String tName)
    {
        return studentRepository.getTeacherByName(tName);
    }

    public ArrayList<String> getStudentByTeacherName(String tName)
    {
        return studentRepository.getStudentByTeacherName(tName);
    }

    public ArrayList<String> getAllStudents()
    {
        return studentRepository.getAllStudents();
    }

    public void deleteTeacherByName(String tName)
    {
        studentRepository.deleteTeacherByName(tName);
    }

    public void deleteAllTeachers()
    {
        studentRepository.deleteAllTeachers();
    }


}
