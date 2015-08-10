import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void isListItem_divisibleByFifteen_returnsPingPong() {
        PingPong testPingPong = new PingPong();
        assertEquals("ping-pong", testPingPong.checkPingPongValue(15));
    }

    @Test
    public void isListItem_divisibleByThree_returnsPing() {
        PingPong testPing = new PingPong();
        assertEquals("ping", testPing.checkPingPongValue(3));
    }

    @Test
    public void isListItem_divisibleByFive_returnsPong() {
        PingPong testPong = new PingPong();
        assertEquals("pong", testPong.checkPingPongValue(5));
    }

//  @Test
//    public void isListItem_listItem_returnsListItem() {
//        PingPong testListItem = new PingPong();
//        assertEquals(stringNumber, testStringNumber.checkPingPongValue(7));
//    }

}
