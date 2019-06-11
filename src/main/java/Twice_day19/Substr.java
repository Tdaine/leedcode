package Twice_day19;

import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] ret = new boolean[n];
        for (int i = 0; i <n; i++){
            if (s.contains(p[i])){
                ret[i] = true;
            }else ret[i] = false;
        }
        return ret;
    }
}