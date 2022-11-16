package com.timurnabiyev.postgresql_course;

public class UsStates {
    private Integer stateId;
    private String stateName;
    private String stateAbbr;
    private String stateRegion;

    public UsStates() {
    }

    public UsStates(Integer stateId, String stateName, String stateAbbr, String stateRegion) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.stateAbbr = stateAbbr;
        this.stateRegion = stateRegion;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getStateRegion() {
        return stateRegion;
    }

    public void setStateRegion(String stateRegion) {
        this.stateRegion = stateRegion;
    }
}
