package org.example.service;

import org.example.model.GlucoseReading;
import org.example.repository.GlucoseReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlucoseReadingService {

    @Autowired
    private GlucoseReadingRepository repository;

    public List<GlucoseReading> getAllReadings() {
        return repository.findAll();
    }

    public void saveReading(GlucoseReading reading) {
        repository.save(reading);
    }

    public void deleteReading(Long id) {
        repository.deleteById(id);
    }
}
