import java.io.*;
import java.util.*;
class program {
    public static void main(String[] args)
    {
        System.out.println(possibleCounts(100));
    }
    public static int possibleCounts(int a)
    {
        int[] Array = new int[a + 1];
        Array[2] = 1;
        for (int i = 2; i <= a; i++)
        {
            if (i + 1 <= a) {
                Array[i + 1] += Array[i];
            }
            if (i * 2 <= a)
            {
                Array[i * 2] += Array[i];
            }
        }
        return Array[a];
    }
}