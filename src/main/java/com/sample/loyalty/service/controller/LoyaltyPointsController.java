package com.sample.loyalty.service.controller;


import com.sample.loyalty.service.entity.LoyaltyPoints;
import com.sample.loyalty.service.service.LoyaltyPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/points")
@RestController
public class LoyaltyPointsController
{
    @Autowired
    private LoyaltyPointsService loyaltyPointsService;


    @GetMapping("/all")
    public List<LoyaltyPoints> getAllPoints() {
        return loyaltyPointsService.getAllPoints();
    }


    @GetMapping("/userId/{userId}")
    public LoyaltyPoints getPointsByUserId(@PathVariable String userId) {
        return loyaltyPointsService.getPointsByUserId(userId);
    }


    @GetMapping("/userName/{userName}")
    public List<LoyaltyPoints> getPointsByUserName(@PathVariable String userName) {
        return loyaltyPointsService.getPointsByUserName(userName);
    }
}

