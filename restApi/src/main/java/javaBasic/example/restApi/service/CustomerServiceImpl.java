package javaBasic.example.restApi.service;

import javaBasic.example.restApi.common.MappingAddress;
import javaBasic.example.restApi.common.MappingCustomer;
import javaBasic.example.restApi.entity.Address;
import javaBasic.example.restApi.entity.Customer;
import javaBasic.example.restApi.entity.CustomerParam;
import javaBasic.example.restApi.model.CustomerFilter;
import javaBasic.example.restApi.model.CustomerModel;
import javaBasic.example.restApi.repository.AddressRepository;
import javaBasic.example.restApi.repository.CustomerRepository;
import javaBasic.example.restApi.repository.specification.CustomerSpecification;
import javaBasic.example.restApi.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Configuration
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    AddressRepository addressRepository;

    @Override
    public CustomerResponse createCustomer(CustomerModel customerModel) {
        ArrayList<Address> addressModels =MappingAddress.fomartAddress(customerModel.addresses);
        ArrayList<String> arrayList =new ArrayList<>();
        for (Address address:addressModels){
            Address a = addressRepository.save(address);
            arrayList.add(a.clientId);
        };
        Customer customer =MappingCustomer.fomartCustomerEntity(customerModel);
        customer.addressIds =arrayList;
        customerRepository.save(customer);
        return MappingCustomer.fomartCustomerModel(customerModel);
    }

    @Override
    public CustomerResponse updateCustomerById(CustomerModel customerModel, String client_id) {
        Optional<Customer> customer1 = customerRepository.findById(client_id);
        System.out.println("customerModel = " + customer1.isPresent());
        if(customer1.isPresent()){
            customerRepository.save(MappingCustomer.fomartCustomerEntity(customerModel));
            return MappingCustomer.fomartCustomerModel(customerModel);
        }
        return null;
    }

    @Override
    public List<CustomerResponse> filterCustomer(CustomerParam customerParam) {
        List<CustomerResponse> customerResponses =new ArrayList<>();
        CustomerResponse customerResponse =new CustomerResponse();
        List<Customer> customers = customerRepository.filterCustomers(customerParam.getName(),customerParam.getEmail());
        if(customers !=null && customers.size()>0){
            for (Customer customer :customers){
                customerResponse.firstName =customer.firstName;
                customerResponse.clientId =customer.clientId;
                customerResponse.email =customer.email;
                customerResponses.add(customerResponse);
            }
            return  customerResponses;
        }
        return null;
    }

    @Override
    public Iterable<Customer> filterV2(CustomerFilter filter, Pageable pageable) {
        CustomerSpecification specification = new CustomerSpecification(filter);
        return customerRepository.findAll(specification, pageable);
    }
}
