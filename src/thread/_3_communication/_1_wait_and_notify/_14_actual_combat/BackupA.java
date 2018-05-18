package thread._3_communication._1_wait_and_notify._14_actual_combat;

class BackupA extends Thread {
    private DBTools dbTools;

    BackupA(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
