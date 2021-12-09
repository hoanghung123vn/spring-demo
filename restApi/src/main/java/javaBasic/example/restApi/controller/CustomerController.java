package javaBasic.example.restApi.controller;

import javaBasic.example.restApi.entity.Customer;
import javaBasic.example.restApi.entity.CustomerParam;
import javaBasic.example.restApi.model.CustomerModel;
import javaBasic.example.restApi.repository.CustomerRepository;
import javaBasic.example.restApi.response.CustomerResponse;
import javaBasic.example.restApi.service.CustomerService;
import javaBasic.example.restApi.validate.ErrorModelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired()
    private CustomerService customerService;
    @PostMapping("/")
    public CustomerResponse createCustomer(@RequestBody CustomerModel customerModel){
        Map<String, Object> errors = new HashMap<>();
        CustomerResponse c = customerService.createCustomer(customerModel);
        return c;
    }
    @PutMapping("/{id}")
    public CustomerResponse updateCustomer(@RequestBody CustomerModel customerModel,@PathVariable String id){
        CustomerResponse c = customerService.updateCustomerById(customerModel,id);
        return c;
    }
    @GetMapping("/filter")
    public List<CustomerResponse> filterCustomer(
//            @RequestParam Map<String,String> mapping
                                                 @RequestParam(value = "name", required = false) String name,
                                                 @RequestParam(value = "limit", required = false) String limit,
                                                 @RequestParam(value = "storeId", required = false) String storeId,
                                                 @RequestParam(value = "page", required = false) String page,
                                                 @RequestParam(value = "merchantId", required = false) String merchantId,
                                                 @RequestParam(value = "email", required = false) String email
    ){
        CustomerParam customerParam = new CustomerParam(name, email);
        List<CustomerResponse> customerResponses = customerService.filterCustomer(customerParam);
        return customerResponses;
    }
}
