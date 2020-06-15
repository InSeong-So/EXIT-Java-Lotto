package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Draw
{
    private void Lotto()
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
        
        System.out.println(Arrays.toString(lottoNums));
    }
    
}
