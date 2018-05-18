package thread._3_communication._1_wait_and_notify._12_pipeline_byte_stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 在Java语言中提供了各种各样的输入/输出流Stream，使我们能够很方便地对数据进行操作，
 * 其中管道流(pipeStream)是一种特殊的流，用于在不同线程间直接传送数据。一个线程发送数据到输出管道，
 * 另一个线程从输出管道中读取数据。通过使用管道，实现不同线程间的通信，而无需借助于类似临时文件之类的东西。
 * 在Java的JDK中提供了4个类来使线程间可以进行通信：
 * 1)PipedInputStream和PipedOutputStream
 * 2)PipedReader和PipedWriter
 *
 * 使用代码inputStream.connect(outputStream)或outputStream.connect(inputStream)的作用使两个Stream之间产生通信链接，
 * 这样才可以将数据进行输出与输入。
 * 从打印结果来看，这两个线程通过管道流成功进行数据的传输。
 * 但此实验中，首先是读取线程new ThreadRead(inputStream)启动，由于当时没有数据被写入，
 * 所以线程阻塞在int readLength = input.read(byteArray)；代码中，直到有数据被写入，菜继续向下运行。
 */
class MyMain {

    public static void main(String[] args) {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedInputStream inputStream = new PipedInputStream();
        PipedOutputStream outputStream = new PipedOutputStream();
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
