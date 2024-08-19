package com.example.calstar2024.web;

import com.example.calstar2024.payload.request.CalculationRequest;
import com.example.calstar2024.service.CalculationService;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calstar")
@CrossOrigin(maxAge = 3600)
@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
})
public class CalculationController {

    @Autowired
    CalculationService calculationService;

    @PostMapping("/calc")
    public ResponseEntity getCalculations(@RequestBody CalculationRequest calculationRequest) {
        return ResponseEntity.ok(calculationService.getCalculationObjects(calculationRequest));
    }
}
