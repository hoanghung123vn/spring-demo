package javaBasic.example.restApi.controller;

import javaBasic.example.restApi.entity.CustomerParam;
import javaBasic.example.restApi.model.CustomerFilter;
import javaBasic.example.restApi.model.CustomerModel;
import javaBasic.example.restApi.response.CustomerResponse;
import javaBasic.example.restApi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/filterV2")
    public ResponseEntity filterV2(@Valid CustomerFilter filter, Pageable pageable) {
        return ResponseEntity.ok().body(customerService.filterV2(filter, pageable));
    }
}
