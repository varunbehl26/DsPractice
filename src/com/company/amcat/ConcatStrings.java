package com.company.amcat;

import java.util.*;

public class ConcatStrings {

    public static void main(String[] args) {
        List<String> output = findAllConcatenatedWordsInADict(new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"});

        for (String s : output) {
            System.out.println(s);
        }
    }

    public static List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        HashMap<String, Boolean> cache = new HashMap<>();
        for (String word : words)
            if (dfs(word, wordSet, cache)) {
                ans.add(word);
            }
        return ans;
    }

    static boolean dfs(String word, HashSet<String> wordSet, HashMap<String, Boolean> cache) {
        if (cache.containsKey(word)) return cache.get(word);
        for (int i = 1; i < word.length(); i++) {
            if (wordSet.contains(word.substring(0, i))) {
                String suffix = word.substring(i);
                if (wordSet.contains(suffix) || dfs(suffix, wordSet, cache)) {
                    cache.put(word, true);
                    return true;
                }
            }
        }
        cache.put(word, false);
        return false;
    }
}