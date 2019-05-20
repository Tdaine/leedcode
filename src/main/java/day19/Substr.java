package day19;

class Substr {
    public boolean[] chkSubStr(String[] p,int n,String s){
        boolean[] hasSub = new boolean[n];
        for (int i = 0; i < n; i++){
            hasSub[i] = s.contains(p[i]);
        }
        return hasSub;
    }
}
