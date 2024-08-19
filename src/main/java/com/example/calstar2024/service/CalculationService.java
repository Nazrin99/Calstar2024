package com.example.calstar2024.service;

import com.example.calstar2024.model.CalculationObject;
import com.example.calstar2024.payload.request.CalculationRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CalculationService {
    List<CalculationObject> getCalculationObjects(CalculationRequest calculationRequest);
}
