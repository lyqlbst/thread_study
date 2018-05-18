package thread._3_communication._1_wait_and_notify._14_actual_combat;

class BackupB extends Thread {
    private DBTools dbTools;

    BackupB(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
