package org.example.EmpAdd1to1.Controller;

import org.example.EmpAdd1to1.Model.Address;
import org.example.EmpAdd1to1.Model.Employee;
import org.example.EmpAdd1to1.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    //Get all employees
    @GetMapping("employees")
    Iterable<Employee> getAllEmp()
    {
        return empService.getAllEmp();
    }

    //Add employees
    @PostMapping("employees")
    void addEmployee(@RequestBody List<Employee> employees)
    {
        empService.addEmployee(employees);
    }

    //Get employees by id
    @GetMapping("employees/{Id}")
    Employee getEmpById(@PathVariable Long Id)
    {
        return empService.getEmpById(Id);
    }
    //Update an employee by id
    @PutMapping("employees/{Id}/{FName}")
    String updateFNameById(@PathVariable Long Id, @PathVariable String FName)
    {
        return empService.updateFNameById(Id, FName);
    }

    //delete employee by id
    @DeleteMapping("employees/{Id}")
    String deleteById(@PathVariable Long Id)
    {
        return empService.deleteById(Id);
    }
}
