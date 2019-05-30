package RestoreIPAddresses93;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public String s;

    @BeforeEach
    void setUp() {

        s = new String("25525511135");
    }

    @Test
    void restoreIpAddresses() {
        Solution solution = new Solution();
        solution.restoreIpAddresses(this.s);
    }
}