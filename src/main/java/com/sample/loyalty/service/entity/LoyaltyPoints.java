package com.sample.loyalty.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoyaltyPoints
{
    private String userId;
    private String userName;
    private int points;

}
