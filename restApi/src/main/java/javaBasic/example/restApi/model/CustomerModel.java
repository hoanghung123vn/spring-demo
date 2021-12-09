package javaBasic.example.restApi.model;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CustomerModel {
    public String clientId;
    public boolean acceptsMarketing;
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
    public ArrayList<AddressModel> addresses;
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String sex;

    public String getClientId() {
        return clientId;
    }

    public boolean getAccepts_marketing() {
        return acceptsMarketing;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public String state;
    public String storeLastOrderName;
    public String storeLastName;
    public long storeOrderCount;
    public long storeTotalSpent;

    public ArrayList<AddressModel> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<AddressModel> addresses) {
        this.addresses = addresses;
    }

    public String tagAliases;
    public String tags;
    public long totalSpent;
    public String zaloId;

    public boolean isAcceptsMarketing() {
        return acceptsMarketing;
    }

    public void setAcceptsMarketing(boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public long getDefaultAddressId() {
        return defaultAddressId;
    }

    public void setDefaultAddressId(long defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public String getLastOrderName() {
        return lastOrderName;
    }

    public void setLastOrderName(String lastOrderName) {
        this.lastOrderName = lastOrderName;
    }

    public String getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
    }

    public long getLoyaltyPoint() {
        return loyaltyPoint;
    }

    public void setLoyaltyPoint(long loyaltyPoint) {
        this.loyaltyPoint = loyaltyPoint;
    }

    public long getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(long orderCount) {
        this.orderCount = orderCount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStoreLastOrderName() {
        return storeLastOrderName;
    }

    public void setStoreLastOrderName(String storeLastOrderName) {
        this.storeLastOrderName = storeLastOrderName;
    }

    public String getStoreLastName() {
        return storeLastName;
    }

    public void setStoreLastName(String storeLastName) {
        this.storeLastName = storeLastName;
    }

    public long getStoreOrderCount() {
        return storeOrderCount;
    }

    public void setStoreOrderCount(long storeOrderCount) {
        this.storeOrderCount = storeOrderCount;
    }

    public long getStoreTotalSpent() {
        return storeTotalSpent;
    }

    public void setStoreTotalSpent(long storeTotalSpent) {
        this.storeTotalSpent = storeTotalSpent;
    }

    public String getTagAliases() {
        return tagAliases;
    }

    public void setTagAliases(String tagAliases) {
        this.tagAliases = tagAliases;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public long getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(long totalSpent) {
        this.totalSpent = totalSpent;
    }

    public String getZaloId() {
        return zaloId;
    }

    public void setZaloId(String zaloId) {
        this.zaloId = zaloId;
    }
}
