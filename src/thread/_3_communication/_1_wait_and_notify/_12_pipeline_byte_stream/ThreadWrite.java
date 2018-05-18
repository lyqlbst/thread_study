package thread._3_communication._1_wait_and_notify._12_pipeline_byte_stream;

import java.io.PipedOutputStream;

class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;

    ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
