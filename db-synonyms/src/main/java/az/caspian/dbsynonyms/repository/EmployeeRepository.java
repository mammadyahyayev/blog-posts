package az.caspian.dbsynonyms.repository;

import az.caspian.dbsynonyms.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query(value = "select * from hr.employees", nativeQuery = true)
    List<Employee> getAllEmployees();


    @Query(value = "select * from emp", nativeQuery = true)
    List<Employee> getAllEmployeesWithSynonym();

}
