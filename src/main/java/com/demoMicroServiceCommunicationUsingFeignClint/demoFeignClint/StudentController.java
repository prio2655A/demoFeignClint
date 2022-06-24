package com.demoMicroServiceCommunicationUsingFeignClint.demoFeignClint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/microService1")
@RestController
public class StudentController {
    @Autowired
    RestClintService restClintService;
    @GetMapping("/student/save")
    public Student save()
    {
        Student student= new Student();
        student.setFirstName("Prio");
        student.setLastName("Malik");
        return restClintService.save(student);
    }
}
