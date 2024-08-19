package com.example.calstar2024.model;

import java.util.Date;

public class CalculationObject {
    private Double interestOn, basicRate, interestAmount, total;

    private Integer duration;

    private Date startDate, endDate;

    public Double getInterestOn() {
        return interestOn;
    }

    public void setInterestOn(Double interestOn) {
        this.interestOn = interestOn;
    }

    public Double getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(Double basicRate) {
        this.basicRate = basicRate;
    }

    public Double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public CalculationObject() {
    }
}
