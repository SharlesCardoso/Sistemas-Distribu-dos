package Util;

import View.Principal;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *
 * @author Sharles Cardoso
 */
public class getSystemOut {

    public getSystemOut() {
        System.setOut(new PrintStream(new OutputStream() {
            ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();

            @Override
            public void write(int b) throws IOException {
                arrayOutputStream.write(b);
            }

            @Override
            public void flush() throws IOException {
                Principal.LOG.append(arrayOutputStream.toString());
                arrayOutputStream.reset();
            }

            @Override
            public void close() throws IOException {
                Principal.LOG.append(arrayOutputStream.toString());
                arrayOutputStream.reset();
            }
        }, true));
    }

}
