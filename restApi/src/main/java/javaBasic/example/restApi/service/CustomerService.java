package javaBasic.example.restApi.service;

import javaBasic.example.restApi.entity.Customer;
import javaBasic.example.restApi.entity.CustomerParam;
import javaBasic.example.restApi.model.CustomerModel;
import javaBasic.example.restApi.response.CustomerResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    CustomerResponse createCustomer(CustomerModel customer);
    CustomerResponse updateCustomerById(CustomerModel customer,String client_id);
    List<CustomerResponse> filterCustomer(CustomerParam customerParam);
}
