package az.caspian.remoteconnectionapp.controller;

import az.caspian.remoteconnectionapp.model.Student;
import az.caspian.remoteconnectionapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public Student createStudent(
            @RequestParam String firstName,
            @RequestParam String lastName
    ) {
        return studentService.createStudent(firstName, lastName);
    }
}
