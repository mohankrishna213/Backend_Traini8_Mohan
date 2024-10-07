package com.example.backend_traini8_mohan.service;

import com.example.backend_traini8_mohan.model.TrainingCenter;
import com.example.backend_traini8_mohan.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(System.currentTimeMillis());
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
