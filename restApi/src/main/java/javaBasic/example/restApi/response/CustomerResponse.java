package javaBasic.example.restApi.response;

import java.sql.Timestamp;

public class CustomerResponse {
    public String clientId;
    public String acceptsMarketing;
    public Timestamp birthday;
    public Timestamp createdOn;
    public long defaultAddressId;
    public String email;
    public String firstName;
    public String lastName;
    public String lastOrderId;
    public String lastOrderName;
    public String memberShip;
    public long loyaltyPoint;
    public long modifiedOn;
    public long orderCount;
    public String note;
    public String phone;
    public String sex;
    public String state;
    public String storeLastOrderName;
    public String storeLastName;
    public long storeOrderCount;
    public long storeTotalSpent;
    public String tagAliases;
    public String tags;
    public long totalSpent;
    public String zaloId;
    public String addressIds;

    public CustomerResponse() {
    }

    public CustomerResponse(String clientId, String acceptsMarketing, Timestamp birthday, Timestamp createdOn, long defaultAddressId, String email, String firstName, String lastName, String lastOrderId, String lastOrderName, String memberShip, long loyaltyPoint, long modifiedOn, long orderCount, String note, String phone, String sex, String state, String storeLastOrderName, String storeLastName, long storeOrderCount, long storeTotalSpent, String tagAliases, String tags, long totalSpent, String zaloId, String addressIds) {
        this.clientId = clientId;
        this.acceptsMarketing = acceptsMarketing;
        this.birthday = birthday;
        this.createdOn = createdOn;
        this.defaultAddressId = defaultAddressId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastOrderId = lastOrderId;
        this.lastOrderName = lastOrderName;
        this.memberShip = memberShip;
        this.loyaltyPoint = loyaltyPoint;
        this.modifiedOn = modifiedOn;
        this.orderCount = orderCount;
        this.note = note;
        this.phone = phone;
        this.sex = sex;
        this.state = state;
        this.storeLastOrderName = storeLastOrderName;
        this.storeLastName = storeLastName;
        this.storeOrderCount = storeOrderCount;
        this.storeTotalSpent = storeTotalSpent;
        this.tagAliases = tagAliases;
        this.tags = tags;
        this.totalSpent = totalSpent;
        this.zaloId = zaloId;
        this.addressIds = addressIds;
    }
}
