import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class TimeoutTest {

    @Test
    void testAssertTimeout() {
        assertTimeout(Duration.ofSeconds(3) , () -> {
            Thread.sleep(8000);

            System.out.println("This test will be fail after all operations complete because this test takes longer than 3 seconds");
        });

    }

    @Test
    void testAssertTimeoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
            Thread.sleep(8000);

            System.out.println("This test will be fail immediately after 3 seconds because this test takes longer than 3 seconds");
        });
    }
}
