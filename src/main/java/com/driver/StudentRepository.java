package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


@Repository
public class StudentRepository {
    HashMap<String, Student> s = new HashMap<>();
    HashMap<String, Teacher> t = new HashMap<>();
    HashMap<String, List<String>> st = new HashMap<>();


    //for adding student 1
    public void addStudent(Student student) {
        s.put(student.getName(), student);
    }


    //for adding teacher 2
    public void addTeacher(Teacher teacher) {
        t.put(teacher.getName(), teacher);
    }

    //for adding teacher and student 3
    public void addStudentTeacherPair(String sName, String tName) {
        if (s.containsKey(sName) && t.containsKey(tName)) {
            s.put(sName, s.get(sName));
            t.put(tName, t.get(tName));
            List<String> temp = new ArrayList<>();
            if (st.containsKey(tName)) {
                temp = st.get(tName);
            }
            temp.add(sName);
            st.put(tName, temp);
        }
    }


    //getting student by name 4
    public Student getStudentByName(String sName) {
        if (s.containsKey(sName)) {
            return s.get(sName);
        }

        return null;
    }


    //getting teacher by name 5
    public Teacher getTeacherByName(String tName) {
        if (t.containsKey(tName)) {
            return t.get(tName);
        }

        return null;
    }

    //list of all students corresponding to teacher 6
    public List<String> getStudentByTeacherName(String tName) {
        if (st.containsKey(tName)) {
            return st.get(tName);
        }

        return new ArrayList<>();
    }


    //7
    public List<String> getAllStudents() {
        List<String> temp = new ArrayList<>();
        for (String i : s.keySet()) {
            temp.add(i);
        }

        return temp;
    }

    //8

    public void deleteTeacherByName(String tName) {
      /*  List<String> studentList = new ArrayList<>();
        if (st.containsKey(tName)) {
            studentList = st.get(tName);
            for (String student : studentList) {
                if (s.containsKey(student)) {
                    s.remove(student);
                }
            }

            if (t.containsKey(tName)) {
                t.remove(tName);
            }
            st.remove(tName);
        } */
    }


        //9

        public void deleteAllTeachers()
        {
           /* t = new HashMap<>();
            HashSet<String> studentSet = new HashSet<>();
            for (String i : st.keySet()) {
                for (String sName : st.get(i)) {
                    studentSet.add(sName);
                }
            }

            for (String sName : studentSet) {
                if (s.containsKey(sName)) {
                    s.remove(sName);
                }
            }

            st = new HashMap<>(); */
        }

}
