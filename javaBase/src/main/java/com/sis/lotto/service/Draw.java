package com.sis.lotto.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Draw
{
    public int[] Lotto()
    {
        List<Integer> lottoList = new ArrayList<Integer>();
        
        for (int i = 1; i <= 45; i++)
        {
            lottoList.add(i);
        }
        
        Collections.shuffle(lottoList);
        
        int[] lottoNums = new int[6];
        
        for (int i = 0; i < 6; i++)
        {
            lottoNums[i] = lottoList.get(i);
        }
        
        Arrays.sort(lottoNums);
        
        return lottoNums;
    }
    
    /**
     * 1. 자동번호 : 조와 뒤 6자리 번호를 임의의 숫자로 선택
     * 2. 조선택-모든조 : 1~5조까지 모든 번호 선택
     * 3. 조선택-1조~5조 : 조 선택
     * 4. 6자리 번호 선택 : 조 뒤 6자리 번호 선택
     * 5. 선택 완료 : 번호 내역 표시
     * 
     */
    public void PensionLotto(boolean ALL)
    {
        // 자동번호
        if (ALL)
        {
            
        }
        // 병행
        else
        {
            
        }
    }
}
