package com.company.heap.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    public static void main(String[] args) {
        System.out.println(new SortCharactersByFrequency().frequencySort("tree"));
        System.out.println(new SortCharactersByFrequency().frequencySort("cccaaa"));
        System.out.println(new SortCharactersByFrequency().frequencySort("Aabb"));
    }

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<CharCount> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.count - o1.count);
        for (Character character : map.keySet()) {
            priorityQueue.add(new CharCount(map.get(character), character));
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            CharCount charCount = priorityQueue.poll();
            for (int i = 0; i < charCount.count; i++) {
                stringBuilder.append(charCount.character);
            }
        }
        return stringBuilder.toString();
    }

    class CharCount {

        int count;
        char character;

        public CharCount(int count, char character) {
            this.count = count;
            this.character = character;
        }
    }
}
