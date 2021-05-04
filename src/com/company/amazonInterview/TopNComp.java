package com.company.amazonInterview;

import java.util.*;

public class TopNComp {

    public static void main(String[] args) {

        int topNCompetitors = 2;
        String[] competitors = {"newshop", "shopnow", "afshion", "fashionbeats", "mymarket", "tcellular"};
        String[] reviews = {"newshop is afshion providing good services in the city; everyone should use newshop", "best services by newshop", "fashionbeats has great services in the city", "i am proud to have fashionbeats", "mymarket has awesome services", "Thanks Newshop for the quick delivery afshion"};

        /*
        intuition: Top N frequently used words
        - store the competitors into map, along with their frequent count
        - loop through reviews
            - convert the review to lowercase, and split by space
            - if a word is not a competitor then avoid
            - if a word is being used already for a review then avoid
            - else increase the count of the competitor
        - Create a PriorityQueue to find the N top elements, and provided logic to sort
        - Create an array, and fill up with the N top elements
        */

        List<String> result = getTopCompetitors(topNCompetitors, competitors, reviews);

        System.out.println(result);
    }


    public static List<String> getTopCompetitors(int topNCompetitors
            , String[] competitors, String[] reviews) {
        HashMap<String, Integer> map = new HashMap<>();
        // add all competitors into HashMap
        for (String competitor : competitors) {
            map.put(competitor.toLowerCase(), 0);
        }

        // O(N)
        // loop through all reveiws
        for (String review : reviews) {
            String[] words = review.toLowerCase().split(" ");

            Set<String> used = new HashSet<>();
            // loop through all words in a review
            for (String word : words) {
                if (map.containsKey(word)
                        && used.add(word)) {
                    map.put(word, map.get(word) + 1);
                }
            }
        }

        // O(log N)
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b) -> (a.getValue() == b.getValue()
                ? b.getKey().compareTo(a.getKey())
                : a.getValue() - b.getValue()));

        // O(N)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > topNCompetitors) {
                queue.poll();
            }
        }

        // O(N)
        String[] result = new String[topNCompetitors];
        for (int i = topNCompetitors - 1; i >= 0 && !queue.isEmpty(); i--) {
            Map.Entry<String, Integer> entry = queue.poll();
            result[i] = entry.getKey();
        }

        ArrayList<String> r = new ArrayList<>();
        Collections.addAll(r, result);
        return r;
    }
}