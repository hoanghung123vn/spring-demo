package javaBasic.example.restApi.common;

import javaBasic.example.restApi.entity.Customer;
import javaBasic.example.restApi.model.AddressModel;
import javaBasic.example.restApi.model.CustomerModel;
import javaBasic.example.restApi.response.CustomerResponse;

import java.util.ArrayList;

public class MappingCustomer {
    public static CustomerResponse fomartCustomerModel(CustomerModel customerModel){
        CustomerResponse customerResponse =new CustomerResponse();
        customerResponse.firstName=customerModel.firstName;
        customerResponse.clientId=customerModel.clientId;
        return customerResponse;
    }
    public static Customer fomartCustomerEntity(CustomerModel customerModel){
        Customer customer = new Customer();
        customer.clientId=customerModel.clientId;
        customer.firstName =customerModel.firstName;
        customer.lastName=customerModel.lastName;
        customer.phone=customerModel.phone;
//        ArrayList<String> arrayList =new ArrayList<>();
//        if(customerModel.addresses !=null){
//            for (AddressModel addressModel :customerModel.addresses){
//                arrayList.add(addressModel.client_id);
//            }
//        }
//        customer.address_ids =arrayList.toString();
        return customer;
    }
}
