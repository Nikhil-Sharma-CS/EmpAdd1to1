package org.example.EmpAdd1to1.Repository;

import jakarta.transaction.Transactional;
import org.example.EmpAdd1to1.Model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddRepo extends CrudRepository<Address, Long> {
    Address findByaddId(Long id);

    @Transactional
    @Modifying
    @Query(value = "Update address Set street = :Street Where add_id = :Id", nativeQuery = true)
    void updateStreet(Long Id, String Street);
}
