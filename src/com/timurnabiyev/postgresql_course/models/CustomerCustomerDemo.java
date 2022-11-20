package com.timurnabiyev.postgresql_course.models;

public class CustomerCustomerDemo {
    private String customerId;
    private String customerTypeId;

    public CustomerCustomerDemo() {
    }

    public CustomerCustomerDemo(String customerId, String customerTypeId) {
        this.customerId = customerId;
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
}
