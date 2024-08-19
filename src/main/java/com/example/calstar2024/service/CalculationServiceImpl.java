package com.example.calstar2024.service;

import com.example.calstar2024.model.CalculationObject;
import com.example.calstar2024.payload.request.CalculationRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculationServiceImpl implements CalculationService {
    @Override
    public List<CalculationObject> getCalculationObjects(CalculationRequest calculationRequest) {
        return null;
    }
}
