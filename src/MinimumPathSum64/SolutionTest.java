package MinimumPathSum64;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public int [][] grid;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        grid = new int[][]
                {{1,4,8,6,2,2,1,7},
                        {4,7,3,1,4,5,5,1},
                        {8,8,2,1,1,8,0,1},
                        {8,9,2,9,8,0,8,9},
                        {5,7,5,7,1,8,5,5},
                        {7,0,9,4,5,6,5,6},
                        {4,9,9,7,9,1,9,0}};
    }

    @org.junit.jupiter.api.Test
    void minPathSum() {
        assertEquals(47,Solution.minPathSum(this.grid));
    }
}