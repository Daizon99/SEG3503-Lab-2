import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest {

    private int y, m, d;

    public DateNextDateExceptionTest(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    @Parameters
    public static List<Integer[]> data() {
        List<Integer[]> params = new LinkedList<>();

        params.add(new Integer [] {1500, 2, 31});
        params.add(new Integer [] {1500, 2, 29});
        params.add(new Integer [] {-1, 10, 20});
        params.add(new Integer [] {1458, 15, 12});
        params.add(new Integer [] {1975, 6, -50});
        return params; 
    }

    @Test
    public void testNextDate() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {new Date(y, m, d);});
    }
}
