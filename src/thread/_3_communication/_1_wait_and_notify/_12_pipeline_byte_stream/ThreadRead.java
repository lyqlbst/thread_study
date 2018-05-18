package thread._3_communication._1_wait_and_notify._12_pipeline_byte_stream;

import java.io.PipedInputStream;

class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
