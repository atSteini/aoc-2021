package day1;

import commons.Inputs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day1Solution {
    public static void main(String[] args) {
        System.err.println("Part1: ");
        part1(Inputs.day1());

        System.err.println("Part2: ");
        part2(Inputs.day1());
    }

    public static int part2(String input) {
        List<String> depthsString = List.of(input.split("\n"));
        List<Integer> depths = listToInt(depthsString);

        List<Integer> sums = new ArrayList<>();
        int k = 3;

        for (int i = 0; i < depths.size() - k + 1; i++) {
            sums.add(depths.get(i));

            int tempSum = 0;

            for (int ii = i; ii < i + k; ii++) {
                tempSum += depths.get(ii);
            }

            sums.set(i, tempSum);
        }

        return part1Algo(sums);
    }

    public static int part1(String input) {
        List<String> depths = List.of(input.split("\n"));

        List<Integer> depthsInt = listToInt(depths);

        return part1Algo(depthsInt);
    }

    public static List<Integer> listToInt(List<String> list) {
        return list.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    public static int part1Algo(List<Integer> depthsInt) {
        int lastDepth = -1, greaterCounter = 0;
        for (int depth : depthsInt) {
            System.out.print(depth + " -> ");

            if (lastDepth != -1) {
                if (depth > lastDepth) {
                    System.out.println("incremented");

                    greaterCounter++;
                } else {
                    System.out.println("decremented");
                }
            } else {
                System.out.println("N/A");
            }

            lastDepth = depth;
        }

        System.out.println("Number of incremented: " + greaterCounter);

        return greaterCounter;
    }
}
