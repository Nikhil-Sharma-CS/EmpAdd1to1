package org.example.EmpAdd1to1.Repository;

import jakarta.transaction.Transactional;
import org.example.EmpAdd1to1.Model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmpRepo extends CrudRepository<Employee, Long> {

    Employee findByempId(Long Id);

    @Transactional
    @Modifying
    @Query(value = "Update employee Set first_name = :FName Where emp_id = :Id", nativeQuery = true)
    void updateName(Long Id, String FName);
}
