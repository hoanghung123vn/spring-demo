package javaBasic.example.restApi.repository;

import javaBasic.example.restApi.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
}
