package javaBasic.example.restApi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "address")
public class Address {
    public String address;
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    public String clientId;
    public String country;
    public String countryCode;
    public String district;
    public String districtCode;
    public Timestamp createOne;
    public Timestamp modifiedOn;
    public String province;
    public String provinceCode;
    public String ward;
    public String zipCode;

    public Address() {
    }

    public Address(String address, String clientId, String country, String countryCode, String district, String districtCode, Timestamp createOne, Timestamp modifiedOn, String province, String provinceCode, String ward, String zipCode) {
        this.address = address;
        this.clientId = clientId;
        this.country = country;
        this.countryCode = countryCode;
        this.district = district;
        this.districtCode = districtCode;
        this.createOne = createOne;
        this.modifiedOn = modifiedOn;
        this.province = province;
        this.provinceCode = provinceCode;
        this.ward = ward;
        this.zipCode = zipCode;
    }
}
