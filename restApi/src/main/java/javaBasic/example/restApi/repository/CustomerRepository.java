package javaBasic.example.restApi.repository;

import javaBasic.example.restApi.entity.Customer;
import javaBasic.example.restApi.response.CustomerResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,String > {
    @Query("select c from Customer c where c.firstName = ?1 and c.email=?2" )
    List<Customer> filterCustomers(String firstName,String email);
}
