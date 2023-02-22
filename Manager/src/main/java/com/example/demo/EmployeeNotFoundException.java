package main.java.com.example.demo;

public class EmployeeNotFoundException extends RuntimeException{

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
