package javaBasic.example.restApi.common;

import javaBasic.example.restApi.entity.Address;
import javaBasic.example.restApi.model.AddressModel;
import javaBasic.example.restApi.repository.AddressRepository;

import java.util.ArrayList;
import java.util.UUID;

public class MappingAddress {
    public static ArrayList<Address> fomartAddress(ArrayList<AddressModel> addresses){
        Address address = new Address();
        ArrayList<Address> lists =new ArrayList<>();
        for (AddressModel addressModel:addresses){
            address.clientId = UUID.randomUUID().toString();
            address.province=addressModel.province;
            address.district=addressModel.district;
            address.ward=addressModel.ward;
            lists.add(address);
        }
        return lists;
    }
}
