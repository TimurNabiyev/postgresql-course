package com.timurnabiyev.postgresql_course;

public class CustomerDemographics {
    private String customerTypeId;
    private String customerDesc;

    public CustomerDemographics() {
    }

    public CustomerDemographics(String customerTypeId, String customerDesc) {
        this.customerTypeId = customerTypeId;
        this.customerDesc = customerDesc;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc;
    }
}
