import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class PJOINPDUTest {

    long time = System.currentTimeMillis();


    byte t1 = (byte) (time&0xff);
    byte t2 = (byte) ((time>>1)&0xff);
    byte t3 = (byte) ((time>>2)&0xff);
    byte t4 = (byte) ((time>>3)&0xff);

    String identity = new String();


    @Test
    public void shouldCreateConstructor () {
        byte buffer[] = new byte[] {11, (byte)identity.length(), 0, 0, t4, t3, t2, t1, };
        InputStream input = new ByteArrayInputStream(buffer);
    }
}
