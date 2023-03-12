package com.sanedge.java.BreathFirstSearch.wordladder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Word {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, Integer> wordMap = getWordMap(wordList, beginWord);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;

            int qSize = queue.size();

            for (int i = 0; i < qSize; i++) {
                String word = queue.poll();

                List<String> candidates = getCandidates(word);

                for (String candidate : candidates) {
                    if (wordMap.containsKey(candidate)) {
                        if (candidate.equals(endWord)) {
                            return depth + 1;
                        }

                        wordMap.remove(candidate);
                        queue.offer(candidate);
                    }
                }
            }
        }

        return 0;
    }

    private Map<String, Integer> getWordMap(List<String> wordList, String beginWord) {
        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);

            if (!wordMap.containsKey(word)) {
                if (!word.equals(beginWord)) {
                    wordMap.put(word, i);
                }
            }
        }

        return wordMap;
    }

    private List<String> getCandidates(String word) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) != (char) ('a' + i)) {
                    res.add(word.substring(0, j) + (char) ('a' + i) + word.substring(j + 1));
                }
            }
        }

        return res;
    }
}
