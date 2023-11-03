package com.sensor.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;

public class SensorDTO {

    @NotEmpty(message = "Give me a name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
