package org.example.EmpAdd1to1.Service;

import org.example.EmpAdd1to1.Model.Employee;
import org.example.EmpAdd1to1.Repository.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    IEmpRepo iEmpRepo;

    public Iterable<Employee> getAllEmp() {
        return iEmpRepo.findAll();
    }

    public void addEmployee(List<Employee> employees) {
        iEmpRepo.saveAll(employees);
    }

    public Employee getEmpById(Long id) {
        return iEmpRepo.findByempId(id);
    }

    public String deleteById(Long id) {
        iEmpRepo.deleteById(id);
        return "Employee Deleted";
    }

    public String updateFNameById(Long id, String FName) {

        iEmpRepo.updateName(id, FName);

        return "First Name Updated";
    }
}
