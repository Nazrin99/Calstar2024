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

        return list;
    }

    private static void getMonthlyPartition(String start, String end) {
        LocalDate startDate = LocalDate.of(Integer.parseInt(start.substring(6)), Integer.parseInt(start.substring(3, 5)), Integer.parseInt(start.substring(0, 2)));
        LocalDate endDate = LocalDate.of(Integer.parseInt(end.substring(6)), Integer.parseInt(end.substring(3, 5)), Integer.parseInt(end.substring(0, 2)));
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

    private static long calculateDuration(int value, LocalDate startDate, LocalDate endDate) {
        LocalDate calculatedStartDate = getStartDate(value, startDate);
        LocalDate calculatedEndDate = getEndDate(value, startDate, endDate);

        return ChronoUnit.DAYS.between(calculatedStartDate, calculatedEndDate) + 1;
    }

    class MonthlyPartition {
        private String startDate;
        private String endDate;

        public MonthlyPartition(String startDate, String endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }
    }

}
