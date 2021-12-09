package javaBasic.example.restApi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    public String clientId;
    @Column(name = "accepts_marketing")
    public boolean acceptsMarketing;
    public Timestamp birthday;
    public Timestamp createdOn;
    public long defaultAddressId;
    public String email;
    @Column(name = "first_name")
    public String firstName;
    public String lastName;
    public String lastOrderId;
    public String lastOrderName;
    public String memberShip;
    public long loyaltyPoint;
    public long modifiedOn;
    public long order_count;
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
    public ArrayList<String> addressIds;

    public Customer() {
    }

    public Customer(String clientId, boolean acceptsMarketing, Timestamp birthday, Timestamp createdOn, long defaultAddressId, String email, String firstName, String lastName, String lastOrderId, String lastOrderName, String memberShip, long loyaltyPoint, long modifiedOn, long order_count, String note, String phone, String sex, String state, String storeLastOrderName, String storeLastName, long storeOrderCount, long storeTotalSpent, String tagAliases, String tags, long totalSpent, String zaloId, ArrayList<String> addressIds) {
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
        this.order_count = order_count;
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

    public String getClientId() {
        return clientId;
    }

    public boolean isAcceptsMarketing() {
        return acceptsMarketing;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public long getDefaultAddressId() {
        return defaultAddressId;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLastOrderId() {
        return lastOrderId;
    }

    public String getLastOrderName() {
        return lastOrderName;
    }

    public String getMemberShip() {
        return memberShip;
    }

    public long getLoyaltyPoint() {
        return loyaltyPoint;
    }

    public long getModifiedOn() {
        return modifiedOn;
    }

    public long getOrder_count() {
        return order_count;
    }

    public String getNote() {
        return note;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getState() {
        return state;
    }

    public String getStoreLastOrderName() {
        return storeLastOrderName;
    }

    public String getStoreLastName() {
        return storeLastName;
    }

    public long getStoreOrderCount() {
        return storeOrderCount;
    }

    public long getStoreTotalSpent() {
        return storeTotalSpent;
    }

    public String getTagAliases() {
        return tagAliases;
    }

    public String getTags() {
        return tags;
    }

    public long getTotalSpent() {
        return totalSpent;
    }

    public String getZaloId() {
        return zaloId;
    }

    public ArrayList<String> getAddressIds() {
        return addressIds;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setAcceptsMarketing(boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public void setDefaultAddressId(long defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public void setLastOrderName(String lastOrderName) {
        this.lastOrderName = lastOrderName;
    }

    public void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
    }

    public void setLoyaltyPoint(long loyaltyPoint) {
        this.loyaltyPoint = loyaltyPoint;
    }

    public void setModifiedOn(long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public void setOrder_count(long order_count) {
        this.order_count = order_count;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStoreLastOrderName(String storeLastOrderName) {
        this.storeLastOrderName = storeLastOrderName;
    }

    public void setStoreLastName(String storeLastName) {
        this.storeLastName = storeLastName;
    }

    public void setStoreOrderCount(long storeOrderCount) {
        this.storeOrderCount = storeOrderCount;
    }

    public void setStoreTotalSpent(long storeTotalSpent) {
        this.storeTotalSpent = storeTotalSpent;
    }

    public void setTagAliases(String tagAliases) {
        this.tagAliases = tagAliases;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setTotalSpent(long totalSpent) {
        this.totalSpent = totalSpent;
    }

    public void setZaloId(String zaloId) {
        this.zaloId = zaloId;
    }

    public void setAddressIds(ArrayList<String> addressIds) {
        this.addressIds = addressIds;
    }
}
