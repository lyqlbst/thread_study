package thread._3_communication._1_wait_and_notify._13_pipeline_char_stream;

import java.io.PipedReader;

class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;

    ThreadRead(ReadData read, PipedReader input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
