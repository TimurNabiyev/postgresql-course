package com.timurnabiyev.postgresql_course;

public class Territories {
    private String territoryId;
    private String territoryDescription;
    private Integer regionId;

    public Territories() {
    }

    public Territories(String territoryId, String territoryDescription, Integer regionId) {
        this.territoryId = territoryId;
        this.territoryDescription = territoryDescription;
        this.regionId = regionId;
    }

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
}
