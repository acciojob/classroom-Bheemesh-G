package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;



@Repository
public class StudentRepository {
    HashMap<String,Student> s = new HashMap<>();
    HashMap<String,Teacher> t = new HashMap<>();
    HashMap<String, ArrayList<String>> st = new HashMap<>();


    //for adding student
    public void addStudent(Student student)
    {
       s.put(student.getName(),student);
    }


    //for adding teacher
    public void addTeacher(Teacher teacher)
    {
        t.put(teacher.getName(),teacher);
    }
    //for adding teacher and student
    public void addStudentTeacherPair(String sName,String tName)
    {
        if(s.containsKey(sName) && t.containsKey(tName))
        {
            s.put(sName,s.get(sName));
            t.put(tName,t.get(tName));
            ArrayList<String> temp = new ArrayList<>();
            if(st.containsKey(tName))
            {
                temp = st.get(tName);
            }
            temp.add(sName);
            st.put(tName,temp);
        }
    }


    //getting student by name
    public Student getStudentByName(String sName)
    {
        if(s.containsKey(sName))
        {
            return s.get(sName);
        }

        return null;
    }


    //getting teacher by name
    public Teacher getTeacherByName(String tName)
    {
        if(t.containsKey(tName))
        {
            return t.get(tName);
        }

        return null;
    }

    //list of all students corresponding to teacher
    public ArrayList<String> getStudentByTeacherName(String tName)
    {
        if(st.containsKey(tName))
        {
            return st.get(tName);
        }

        return new ArrayList<>();
    }

    public ArrayList<String> getAllStudents()
    {
        ArrayList<String> temp = new ArrayList<>();
        for(String i:s.keySet())
        {
            temp.add(i);
        }

        return temp;
    }

    public void deleteTeacherByName(String tName)
    {
        if(st.containsKey(tName))
        {
            ArrayList<String> temp = st.get(tName);
            for(String i:temp)
            {
                s.remove(i);
            }
        }
        t.remove(tName);
        st.remove(tName);
    }

    public void deleteAllTeachers()
    {
        for(String i:st.keySet())
        {
            ArrayList<String> temp = st.get(i);
            for(String j:temp)
            {
                s.remove(j);
            }

         //   st.remove(i);
        }
    }

}
