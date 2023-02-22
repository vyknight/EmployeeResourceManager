package main.java.com.example.demo;

import org.springframework.data.jpa.repository.JpaRespository;

public interface EmployeeRepository extends JpaRespository<Employee, Long> {

}
