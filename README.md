# Employee-Address One to One Mapping

This is the code for Employee-Address One to One Mapping which uses **One To One Mapping** for relating the database in **Spring Boot**.
This also uses **Relational Data** and **JPA** for data source

- **One to One Mapping** is a type of technique which is used to define realtion betweeen 2 tables or data. 


## 🚀 About Me
*Hi, My name is Nikhil Sharma*,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot.


# Data Flow

## Controller
-   *This section contains 2 classes which uses APIs as mentioned below* :

* ### AddressController Class

    * @PostMapping("addresses")
    * @GetMapping("addresses")
    * @GetMapping("addresses/{Id}")
    * @DeleteMapping("addresses/{Id}")
    * @PutMapping("addresses/{Id}/{Street}")
       
* ### EmployeeController Class

    * @PostMapping("employees")
    * @PutMapping("employees/{Id}/{FName}")
    * @DeleteMapping("employees/{Id}")
    * @GetMapping("employees/{Date}")
    * @GetMapping("employees")

## Services
-  *This section contains 2 classs with functions that helps API to perform their specific tasks* : 

* ### AddService Class

    * Iterable<Address> getAdds()
    * void addAdds(List<Address> addressList)
    * String deleteById(Long id)
    * Address getAddById(Long id)
    * String updateStreetById(Long id, String street)

* ### EmpService Class

    * Iterable<Employee> getAllEmp()
    * void addEmployee(List<Employee> employees)
    * Employee getEmpById(Long id)
    * String deleteById(Long id)
    * String updateFNameById(Long id, String FName)

## Model
- *This section contains 2 models as required by project named **Employee** and **Address**. Both have their relative datamembers in them which will be used as columns to store their respective data*.    

##  Repository
- *This section contains 2 **Interfaces** named IEmpRepo and IAddRepo which extends the **CRUDRepository** of JPA which defines various funtionality of interface and by extension via object of this interface we can access CRUDRepository methods to provide funtionality to our project*.


## Database Design
- *In this section we used a Employee class  and Address which are used as a table to store data*.
- *It also uses **Relational Database** and **JPA** to create datastructure*.
- *We use **MYSQL** which is a management system for relational data*

## Data Structure Used

- *We used **Relational database** along with **JPA** as the data source in this project*.
- *Relational Data is stored in form of tables which further can be connected via various types of mappings/relations, such as One to One, One to Many, etc*.
- *This kind of data persists forever and we use **SQL** to manipulate this data via MYSQL.*
## Summary

*This project performs the task of managing Employee & Address data with various types of API's like **Get, Post, Put, Delete***.

*This project is also connected to a relational data which is the data source of this project.*

*We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.*


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)

