package thread._3_communication._1_wait_and_notify._13_pipeline_char_stream;

import java.io.PipedWriter;

class ThreadWrite extends Thread {
    private WriteData write;
    private PipedWriter out;

    ThreadWrite(WriteData write, PipedWriter out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
