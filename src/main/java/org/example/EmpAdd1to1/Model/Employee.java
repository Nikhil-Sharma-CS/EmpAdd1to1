package org.example.EmpAdd1to1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String first_name;
    private String last_name;

    @OneToOne
    @JoinColumn(name = "foreignKeyAdd")
    Address address;
}
