package com.sis.lotto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sis.lotto.service.Draw;

@RestController
public class MainController
{
    @Autowired
    Draw draw;
    
    @GetMapping("/getAutoLottoNumber")
    public String getAutoLottoNumber()
    {
        draw.Lotto();
        
        return "";
    }
    
    @GetMapping("/getAutoPensionLottoNumber")
    public String getAutoPensionLottoNumber()
    {
        draw.PensionLotto(false);
        
        return "";
    }
}
