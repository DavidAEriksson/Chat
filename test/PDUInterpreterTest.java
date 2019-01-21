/**
 * Created by Wilhelm on 2017-09-15.
 */
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class PDUInterpreterTest {
    @Test
    public void createInterpreter() {
        byte[] buffer = new byte[100];
        ByteArrayInputStream input = new ByteArrayInputStream(buffer);
        PDUInterpreter interpreter = new PDUInterpreter(input);
    }
}
