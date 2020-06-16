package com.sis.lotto.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator
{
    public double LottoRate(int cnt)
    {
        int n = 45;
        int k = 6;
        double A = 1;
        double B = 1;
        
        for (int i = 0; i < k; i++)
        
        {
            
            A = A * n;
            
            n--;
            
            B = B * (i + 1);
            
        }
        
        double result = A / B;
        
        log.info("로또 1등 당첨확률: 1/" + result);
        
        return result;
    }
    
    public Double PensionLottoRate(int cnt)
    {
        Double result = new Double(cnt);
        
        return result;
    }
}
