package az.caspian.dbsynonyms.controller;

import az.caspian.dbsynonyms.entity.Employee;
import az.caspian.dbsynonyms.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> findAll() {
        return employeeRepository.getAllEmployees();
    }

    @GetMapping("/synonym")
    public List<Employee> findAllWithSynonym() {
        return employeeRepository.getAllEmployeesWithSynonym();
    }
}
