package net.springrest.springbootrestapi.Controller;

import net.springrest.springbootrestapi.Beans.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "Atul",
                "Gawade"
        );
        return student;
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Atul", "Gawade"));
        students.add(new Student(2, "Shubham", "Pathak"));
        students.add(new Student(3, "Mihir", "Nar"));
        return students;
    }
}
