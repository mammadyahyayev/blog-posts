package az.caspian.remoteconnectionapp.service;

import az.caspian.remoteconnectionapp.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentService {

    public Student createStudent(String firstName, String lastName) {
        var student = new Student(firstName, lastName);
        log.info("Student created: {}", student);
        return student;
    }
}
