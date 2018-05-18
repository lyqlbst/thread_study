package thread._3_communication._1_wait_and_notify._13_pipeline_char_stream;

import java.io.IOException;
import java.io.PipedWriter;

class WriteData {
    void writeMethod(PipedWriter out) {
        System.out.println("write:");
        for (int i = 0; i < 300; i++) {
            String outData = "" + (i + 1);
            try {
                out.write(outData);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print(outData);
        }
        System.out.println();
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
