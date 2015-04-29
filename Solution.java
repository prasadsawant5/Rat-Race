import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int speed[] = new int[N];
        int distance[] = new int[N];
        int s, d, t, minTime;
        int o = 1, n = 0;
        Map<Integer, Integer> ti = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            speed[i] = sc.nextInt();
        }
        
        for (int j = 0; j < N; j++) {
            distance[j] = sc.nextInt();
        }
        
        for (int k = 0; k < N; k++) {
            s = speed[k];
            d = distance[k];
            ti.put(o, d / s);
            o++;
        }
        
        ArrayList<Integer> ar = new ArrayList<>(ti.values());
        
        Collections.sort(ar);
        
        minTime = ar.get(0);
        
        for (Map.Entry m : ti.entrySet()) {
            if (m.getValue() == minTime) {   
                System.out.println(m.getKey());
            }
            
        } 
        
    }
}
