package cracking_the_coding_interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathToReachCellGridTest {

    private ShortestPathToReachCellGrid shortestPathToReachCellGrid;

    @BeforeEach
    public void setup() {
        shortestPathToReachCellGrid = new ShortestPathToReachCellGrid();
    }

    @Test
    public void should_correctly_return_zero_for_empty_grid_the_minimum_cost() {
        assertEquals(0, shortestPathToReachCellGrid.calculate(0, 0));
    }

    @Test
    public void should_correctly_return_the_minimum_cost() {
        assertEquals(4, shortestPathToReachCellGrid.calculate(2, 2));
    }
}
