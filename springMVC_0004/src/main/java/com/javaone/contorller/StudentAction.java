package com.javaone.contorller;

import com.javaone.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentAction {

    @RequestMapping("/student.action")
    @ResponseBody
    public List<Student> list(){
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 3 ; i++) {
            Student student = new Student("张三",19);
            list.add(student);
        }
        return list;
    }
}
