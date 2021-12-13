package day1;

import commons.Inputs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    @Test
    public void day1SamplePart1() {
        assertEquals(Inputs.day1SampleResultPart1(), Day1Solution.part1(Inputs.day1Sample()));
    }

    @Test
    public void day1SamplePart2() {
        assertEquals(Inputs.day1SampleResultPart2(), Day1Solution.part2(Inputs.day1Sample()));
    }
}
