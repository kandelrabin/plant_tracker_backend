package com.plantTracker.plantTracker.models;

import com.plantTracker.plantTracker.models.enums.Priority;

public class PlantDTO {

    private String name;
    private String priority;
    private long countryId;
    private String plantType;


    public PlantDTO(String name, String priority, long countryId, String plantType) {
        this.name = name;
        this.priority = priority;
        this.countryId = countryId;
        this.plantType = plantType;
    }

    public PlantDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }
}
