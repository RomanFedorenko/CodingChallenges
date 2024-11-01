package com.challenge.zoodisaster;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * see description at -> https://www.codewars.com/kata/5902bc7aba39542b4a00003d/java
 * */

public class ZooDisaster {
    private static final Map<String, List<String>> DIET_MAP = Map.ofEntries(
            Map.entry("antelope", List.of("grass")),
            Map.entry("big-fish", List.of("little-fish")),
            Map.entry("bug", List.of("leaves")),
            Map.entry("bear", List.of("big-fish", "bug", "chicken", "cow", "leaves", "sheep")),
            Map.entry("chicken", List.of("bug")),
            Map.entry("cow", List.of("grass")),
            Map.entry("fox", List.of("chicken", "sheep")),
            Map.entry("giraffe", List.of("leaves")),
            Map.entry("lion", List.of("antelope", "cow")),
            Map.entry("panda", List.of("leaves")),
            Map.entry("sheep", List.of("grass"))
    );

    public static String[] whoEatsWho(final String zoo) {
        ArrayList<String> cells = Arrays.stream(zoo.split(",")).collect(Collectors.toCollection(ArrayList::new));
        List<String> log = new ArrayList<>();
        int[] animalSlaughterIndexes;
        do {
            animalSlaughterIndexes = getAnimalSlaughterIndexes(cells);
            if (animalSlaughterIndexes.length!=0){
                int predatorIndex = animalSlaughterIndexes[0];
                int victimIndex = animalSlaughterIndexes[1];
                log.add(cells.get(predatorIndex)+" eats "+cells.get(victimIndex));
                cells.remove(victimIndex);
            }
        } while (animalSlaughterIndexes.length!=0);

        String[] result = new String[log.size()+2];
        result[0] = zoo;
        for (int i = 1; i < log.size()+1; i++) {
            result[i] = log.get(i-1);
        }
        result[log.size()+1] = String.join(",", cells);

        return result;
    }

    private static int[] getAnimalSlaughterIndexes(List<String> cells) {
        for (int i = 0; i < cells.size(); i++) {
            String current = cells.get(i);
            List<String> currentFood = DIET_MAP.get(current);

            if (currentFood != null) {
                if (i > 0) {
                    String leftNeighbor = cells.get(i - 1);
                    if (currentFood.contains(leftNeighbor)) {
                        return new int[]{i, i - 1};
                    }
                }

                if (i < cells.size() - 1) {
                    String rightNeighbor = cells.get(i + 1);
                    if (currentFood.contains(rightNeighbor)) {
                        return new int[]{i, i + 1};
                    }
                }
            }
        }
        return new int[]{};
    }

}
