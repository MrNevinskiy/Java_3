import HW6.Task2;
import org.junit.Assert;
import org.junit.Test;
import org.apache.log4j.Logger;

import static junit.framework.TestCase.assertTrue;

public class TestTask2 {
    private static final Logger log = Logger.getLogger(TestTask2.class);

    @Test
    public void testTask2AnotherDigits() {
        assertTrue("В массиве есть другие цифры", Task2.process(new int[]{1, 1, 4, 1, 4, 4, 1, 1, 4}));
        log.info("Массив только из 1 и 4");
    }

    @Test(expected = RuntimeException.class)
    public void testTask2Only1And4() {
        Assert.assertFalse("В массиве только 1 и 4", Task2.process(new int[]{1, 4, 2}));
        log.info("В массиве не только 1 и 4");
    }

    @Test(timeout = 1000)
    public void testTask2LongWait() {
        int[] data = new int[900000];
        data[0] = 1;
        data[1] = 1;
        for (int i = 2; i < data.length; i++) {
            final double sin = Math.sin(i);
            data[i] = sin > 0.5 ? 1 : 4;
        }
        Assert.assertTrue("Ошибка", Task2.process(data));
    }

    @Test
    public void testTask2contains1() {
        Assert.assertFalse("В массиве есть 1", Task2.process(new int[]{4,4,4,4,4}));
        log.info("Массив только из 4");
    }

    @Test
    public void testTask2contains4() {
        Assert.assertFalse("В массиве есть 4", Task2.process(new int[]{1,1,1,1,1}));
        log.info("Массив только из 1");
    }
}
