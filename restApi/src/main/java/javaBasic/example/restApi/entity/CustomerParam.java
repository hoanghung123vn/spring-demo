package javaBasic.example.restApi.entity;

public class CustomerParam {
    public String name;
    public String limit;
    public String storeId;
    public String page;
    public String merchantId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String email;

    public CustomerParam(String name, String limit, String storeId, String page, String merchantId,String email) {
        this.name = name;
        this.limit = limit;
        this.storeId = storeId;
        this.page = page;
        this.merchantId = merchantId;
        this.email=email;
    }

    public CustomerParam(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getLimit() {
        return limit;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getPage() {
        return page;
    }

    public String getMerchantId() {
        return merchantId;
    }
}
