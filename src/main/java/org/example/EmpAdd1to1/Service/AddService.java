package org.example.EmpAdd1to1.Service;

import org.example.EmpAdd1to1.Model.Address;
import org.example.EmpAdd1to1.Repository.IAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddService {

    @Autowired
    IAddRepo iAddRepo;

    public Iterable<Address> getAdds() {
        return iAddRepo.findAll();
    }

    public void addAdds(List<Address> addressList) {
        iAddRepo.saveAll(addressList);
    }

    public String deleteById(Long id) {
        iAddRepo.deleteById(id);
        return "Address Deleted";
    }

    public Address getAddById(Long id) {
        return iAddRepo.findByaddId(id);
    }

    public String updateStreetById(Long id, String street) {
        iAddRepo.updateStreet(id, street);

        return "Street Updated";
    }
}
