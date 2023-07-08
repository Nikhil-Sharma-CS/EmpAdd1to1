package org.example.EmpAdd1to1.Controller;


import org.example.EmpAdd1to1.Model.Address;
import org.example.EmpAdd1to1.Service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddController {

    @Autowired
    AddService addService;

    //Get all addresses
    @GetMapping("addresses")
    Iterable<Address> getAdds()
    {
        return addService.getAdds();
    }

    //Add addresses
    @PostMapping("addresses")
    void addAdds(@RequestBody List<Address> addressList)
    {
        addService.addAdds(addressList);
    }

    //Delete address by id
    @DeleteMapping("addresses/{Id}")
    String deleteById(@PathVariable Long Id)
    {
        return addService.deleteById(Id);
    }

    //Update address by id
    @PutMapping("addresses/{Id}/{street}")
    String updateStreetById(@PathVariable Long Id, @PathVariable String street)
    {
        return addService.updateStreetById(Id, street);
    }
    //Get address by id
    @GetMapping("addresses/{Id}")
    Address getAddById(@PathVariable Long Id)
    {
        return addService.getAddById(Id);
    }
}
