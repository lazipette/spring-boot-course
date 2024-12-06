package com.elilou.springdemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {


    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Eliel",
                        "Yankiné",
                        LocalDate.now(),
                        "contact@elielyankine.com",
                        21
                ),

                new Student(
                        "Tiemtore",
                        "Anderson",
                        LocalDate.now(),
                        "contact@tiemtoreanderson.com",
                        23
                )
        );
    }
}

