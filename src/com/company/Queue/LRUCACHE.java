package com.company.Queue;


import java.util.*;

public class LRUCACHE {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            Set<Integer> s = new HashSet<Integer>();
            int n = sc.nextInt();
            LRUCache g = new LRUCache(n);
            int q = sc.nextInt();

            while (q > 0) {

                String c = sc.next();
                //	System.out.println(c);
                if (c.equals("GET")) {
                    int x = sc.nextInt();
                    System.out.print(g.get(x) + " ");
                }
                if (c.equals("SET")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    g.set(x, y);
                }

                q--;
                //System.out.println();
            }
            t--;
            System.out.println();
        }
    }



/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

    /*You are required to complete below class */
    static class LRUCache {
        private int capacity;
        private LinkedHashMap<Integer, Integer> linkedHashMap;

        /*Inititalize an LRU cache with size N */
        public LRUCache(int N) {
            //Your code here
            this.capacity = N;
            this.linkedHashMap = new LinkedHashMap<>();
        }

        /*Returns the value of the key x if
         present else returns -1 */
        public int get(int x) {
            //Your code here
            Integer value = this.linkedHashMap.get(x);
            if (value == null) {
                value = -1;
            } else {
                this.set(x, value);
            }
            return value;
        }

        /*Sets the key x with value y in the LRU cache */
        public void set(int x, int y) {
            //Your code here
            if (this.linkedHashMap.containsKey(x)) {
                this.linkedHashMap.remove(x);
            } else if (this.linkedHashMap.size() == this.capacity) {
                Iterator<Integer> it = this.linkedHashMap.keySet().iterator();
                it.next();
                it.remove();
            }
            linkedHashMap.put(x, y);
        }
    }
}