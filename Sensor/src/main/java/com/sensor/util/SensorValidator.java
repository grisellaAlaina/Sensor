package com.sensor.util;

import com.sensor.models.Sensor;
import com.sensor.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SensorValidator {
//
//    private final SensorService sensorService;
//
//    @Autowired
//    public SensorValidator(SensorService sensorService) {
//        this.sensorService = sensorService;
//    }
//
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return Sensor.class.equals(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        Sensor sensor = (Sensor) target;
//
//        if (sensorService.findByName(sensor.getName()).isPresent())
//            errors.rejectValue("name", "please chose another name");
//
//    }
}
