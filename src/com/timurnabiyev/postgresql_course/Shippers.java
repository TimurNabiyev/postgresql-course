package com.timurnabiyev.postgresql_course;

public class Shippers {
    private Integer shippersId;
    private String companyName;
    private String phone;

    public Shippers() {
    }

    public Shippers(Integer shippersId, String companyName, String phone) {
        this.shippersId = shippersId;
        this.companyName = companyName;
        this.phone = phone;
    }

    public Integer getShippersId() {
        return shippersId;
    }

    public void setShippersId(Integer shippersId) {
        this.shippersId = shippersId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
