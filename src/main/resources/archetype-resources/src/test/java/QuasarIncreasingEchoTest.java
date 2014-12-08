package ${groupId};

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

/**
 * Increasing-Echo Quasar Text
 *
 * @author circlespainter
 */
public class QuasarIncreasingEchoTest {
    @Test
    public void test() throws Exception {
        assertThat(QuasarIncreasingEchoApp.doAll(), is(10));
    }
}