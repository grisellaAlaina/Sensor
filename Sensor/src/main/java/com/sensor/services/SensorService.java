package com.sensor.services;

import com.sensor.models.Sensor;
import com.sensor.repositories.SensorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @Transactional
    public void register(Sensor sensorToAdd) {
        sensorRepository.save(sensorToAdd);
    }

    public Sensor findByName(String name) {
        Optional<Sensor> sensor = sensorRepository.findByName(name);
        return sensor.orElse(null);
    }

    public List<Sensor> findAll() {
        return sensorRepository.findAll();
    }


}
