package com.example.calstar2024.payload.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.Date;

public class CalculationRequest {

    @Nonnull
    private Double principalSum, interestOn, basicRate;

    @Nullable
    private Double costs;

    @Nonnull
    private String interestPeriod, calculationType;

    @Nonnull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate startDate, endDate;

    public CalculationRequest() {

    }

    @Nonnull
    public Double getPrincipalSum() {
        return principalSum;
    }

    public void setPrincipalSum(@Nonnull Double principalSum) {
        this.principalSum = principalSum;
    }

    @Nonnull
    public Double getInterestOn() {
        return interestOn;
    }

    public void setInterestOn(@Nonnull Double interestOn) {
        this.interestOn = interestOn;
    }

    @Nonnull
    public Double getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(@Nonnull Double basicRate) {
        this.basicRate = basicRate;
    }

    @Nullable
    public Double getCosts() {
        return costs;
    }

    public void setCosts(@Nullable Double costs) {
        this.costs = costs;
    }

    @Nonnull
    public String getInterestPeriod() {
        return interestPeriod;
    }

    public void setInterestPeriod(@Nonnull String interestPeriod) {
        this.interestPeriod = interestPeriod;
    }

    @Nonnull
    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(@Nonnull String calculationType) {
        this.calculationType = calculationType;
    }

    @Nonnull
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(@Nonnull LocalDate startDate) {
        this.startDate = startDate;
    }

    @Nonnull
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(@Nonnull LocalDate endDate) {
        this.endDate = endDate;
    }
}
