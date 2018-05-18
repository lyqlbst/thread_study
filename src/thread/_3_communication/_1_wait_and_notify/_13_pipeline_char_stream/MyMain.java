package thread._3_communication._1_wait_and_notify._13_pipeline_char_stream;

import java.io.*;

/**
 * 当然，在管道中还可以传递字符流。
 * 打印的结果和前一个示例基本一样，此实验是两个线程中通过管道流进行字符数据的传输。
 */
class MyMain {

    public static void main(String[] args) {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedReader inputStream = new PipedReader();
        PipedWriter outputStream = new PipedWriter();
        try {
            outputStream.connect(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ThreadRead threadRead = new ThreadRead(readData, inputStream);
        ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
        threadRead.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadWrite.start();
    }
}
