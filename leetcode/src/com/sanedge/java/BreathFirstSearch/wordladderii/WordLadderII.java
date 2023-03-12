package com.sanedge.java.BreathFirstSearch.wordladderii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();

        Map<String, Boolean> wordMap = new HashMap<>();

        for (String w : wordList) {
            wordMap.put(w, true);
        }

        if (!wordMap.containsKey(endWord)) {
            return result;
        }

        List<List<String>> queue = new ArrayList<>();
        List<String> initialPath = new ArrayList<>();

        initialPath.add(beginWord);

        queue.add(initialPath);

        int queueLen = 1;

        Map<String, Boolean> levelMap = new HashMap<>();

        while (!queue.isEmpty()) {
            List<String> path = queue.get(0);
            queue.remove(0);
            String lastWord = path.get(path.size() - 1);

            for (int i = 0; i < lastWord.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    String nextWord = lastWord.substring(0, i) + c + lastWord.substring(i + 1);

                    if (nextWord.equals(endWord)) {
                        path.add(endWord);
                        result.add(path);
                        continue;
                    }

                    if (wordMap.containsKey(nextWord)) {
                        levelMap.put(nextWord, true);
                        List<String> newPath = new ArrayList<>(path);
                        newPath.add(nextWord);
                        queue.add(newPath);
                    }
                }
            }

            queueLen--;

            if (queueLen == 0) {
                if (!result.isEmpty()) {
                    return result;
                }
                for (String k : levelMap.keySet()) {
                    wordMap.remove(k);
                }

                levelMap = new HashMap<>();
                queueLen = queue.size();
            }
        }

        return result;
    }
}
