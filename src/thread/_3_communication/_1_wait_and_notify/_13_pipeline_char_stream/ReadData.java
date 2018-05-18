package thread._3_communication._1_wait_and_notify._13_pipeline_char_stream;

import java.io.IOException;
import java.io.PipedReader;

class ReadData {
    void readMethod(PipedReader input) {
        System.out.println("read:");
        char[] byteArray = new char[20];
        int readLength = 0;
        try {
            readLength = input.read(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (readLength != -1) {
            String newData = new String(byteArray, 0, readLength);
            System.out.print(newData + "");
            try {
                readLength = input.read(byteArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
