package com.company.graph.hard;

import java.util.*;


//DFS
//Dynamic Programming
public class ConcatStrings {

    public static void main(String[] args) {
        List<String> output = findAllConcatenatedWordsInADict(new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"});

        for (String s : output) {
            System.out.println(s);
        }
    }

    public static List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> resultList = new ArrayList<>();

        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        HashMap<String, Boolean> booleanHashMap = new HashMap<>();
        for (String word : words)
            if (dfs(word, wordSet, booleanHashMap)) {
                resultList.add(word);
            }

        return resultList;
    }

    static boolean dfs(String word, HashSet<String> wordSet, HashMap<String, Boolean> cacheMap) {
        if (cacheMap.containsKey(word)) {
            return cacheMap.get(word);
        }
        for (int i = 1; i < word.length(); i++) {
            String substring = word.substring(0, i);
            if (wordSet.contains(substring)) {
                String suffix = word.substring(i);
                if (wordSet.contains(suffix) || dfs(suffix, wordSet, cacheMap)) {
                    cacheMap.put(word, true);
                    return true;
                }
            }
        }
        cacheMap.put(word, false);
        return false;
    }
}