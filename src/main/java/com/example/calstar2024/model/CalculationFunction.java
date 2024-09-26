package com.example.calstar2024.model;

import com.example.calstar2024.payload.request.CalculationRequest;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalculationFunction {
    public static List<CalculationObject> SimpleInterest(CalculationRequest calculationRequest) {
        List<CalculationObject> list = new ArrayList<>();

        for(int i = 0; i < calculateMonths(calculationRequest.getStartDate(), calculationRequest.getEndDate()); i++) {
            CalculationObject calculationObject = new CalculationObject();

            calculationObject.setInterestOn(calculationRequest.getInterestOn());
            calculationObject.setBasicRate(calculationObject.getBasicRate());
            calculationObject.setStartDate(getStartDate(i+1, calculationRequest.getStartDate()));
            calculationObject.setBasicRate(calculationRequest.getBasicRate());
            calculationObject.setEndDate(getEndDate(i+1, calculationRequest.getStartDate(), calculationRequest.getEndDate()));
            calculationObject.setDuration((int) (ChronoUnit.DAYS.between(calculationObject.getStartDate(), calculationObject.getEndDate()) + 1));
            calculationObject.setInterestAmount(calculationRequest.getInterestOn() * calculationRequest.getBasicRate() * calculationObject.getDuration() / 100);
            if (i < 1) {
                calculationObject.setTotal(calculationRequest.getInterestOn() + calculationObject.getInterestAmount());
            }
            else {
                calculationObject.setTotal(list.get(i - 1).getTotal() + calculationObject.getInterestAmount());
            }

            list.add(calculationObject);
        }

        return list;
    }

    private static LocalDate getStartDate(int value, LocalDate startDate) {
        if (value == 1) {
            return startDate;
        } else {
            LocalDate endOfMonth = startDate.plusMonths(value - 2).withDayOfMonth(startDate.plusMonths(value - 2).lengthOfMonth());
            return endOfMonth.plus(1, ChronoUnit.DAYS);
        }
    }

    private static LocalDate getEndDate(int value, LocalDate startDate, LocalDate endDate) {
        if (value == 1) {
            return startDate.withDayOfMonth(startDate.lengthOfMonth());
        } else {
            LocalDate calculatedEndOfMonth = startDate.plusMonths(value - 1).withDayOfMonth(startDate.plusMonths(value - 1).lengthOfMonth());

            if (calculatedEndOfMonth.isAfter(endDate) || calculatedEndOfMonth.isEqual(endDate)) {
                return endDate;
            } else {
                return calculatedEndOfMonth;
            }
        }
    }

    private static long calculateMonths(LocalDate startDate, LocalDate endDate) {
        YearMonth startYearMonth = YearMonth.from(startDate.minusMonths(1));

        YearMonth endYearMonth = YearMonth.from(endDate);

        return ChronoUnit.MONTHS.between(startYearMonth, endYearMonth);
    }
}
