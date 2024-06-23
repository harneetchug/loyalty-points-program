package com.sample.loyalty.service.service;

import com.sample.loyalty.service.entity.LoyaltyPoints;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class LoyaltyPointsService
{

    private final List<LoyaltyPoints> pointsList = new ArrayList<>();


    public LoyaltyPointsService()
    {
        pointsList.add(new LoyaltyPoints("1", "Virat", 1000));
        pointsList.add(new LoyaltyPoints("2", "Himanshu", 2000));
        pointsList.add(new LoyaltyPoints("3", "Harneet", 3000));
    }


    public List<LoyaltyPoints> getAllPoints()
    {
        return pointsList;
    }


    public LoyaltyPoints getPointsByUserId(String userId)
    {
        return pointsList.stream()
                .filter(loyaltyPoints -> loyaltyPoints.getUserId().equals(userId))
                .findFirst()
                .orElse(null);
    }


    public List<LoyaltyPoints> getPointsByUserName(String userName)
    {
        return pointsList.stream()
                .filter(loyaltyPoints -> loyaltyPoints.getUserName().equalsIgnoreCase(userName))
                .collect(Collectors.toList());
    }


}
