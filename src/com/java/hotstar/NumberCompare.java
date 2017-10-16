package com.java.hotstar;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility  classes
import java.util.*;


class NumberCompare {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < N; i++) {
        	 list.add(s.next());
        }
        
            int x = 3;
            int y = ~ x;
            int z;
            z = x > y ? x : y;
            System.out.println(z);
            
            
            
            
        //printLargest(list);
    }

    static void printLargest(List<String> list){
        
        Collections.sort(list, new Comparator<String>(){
        @Override
        public int compare(String X, String Y) {
        String XY=X + Y;
        String YX=Y + X;
        return XY.compareTo(YX) > 0 ? -1:1;
    }
    });
         
    Iterator it = list.iterator();
 
    while(it.hasNext())
        System.out.print(it.next());
     
    }
  
}
