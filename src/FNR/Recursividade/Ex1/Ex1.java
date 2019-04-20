package FNR.Recursividade.Ex1;

import java.util.Arrays;

public class Ex1 {

    static void ordernarCrescente(int nums[], int n)
    {
        if (n <= 1)
            return;
        ordernarCrescente( nums, n-1 );
        int ultimo = nums[n-1];
        int i = n-2;
        while (i >= 0 && nums[i] > ultimo)
        {
            nums[i+1] = nums[i];
            i--;
        }
        nums[i+1] = ultimo;
    }
    public static void main(String[] args)
    {
        int nums[] = {3, 8, 4, 1, 23};

        ordernarCrescente(nums, nums.length);

        System.out.println(Arrays.toString(nums));
    }
}