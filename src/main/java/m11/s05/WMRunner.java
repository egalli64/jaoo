package m11.s05;

public class WMRunner implements Runnable {
    private WithMutexExample wme;
    private WMMode mode;

    public WMRunner(WithMutexExample wme, WMMode mode) {
        this.wme = wme;
        this.mode = mode;
    }

    @Override
    public void run() {
        switch (mode) {
        case ON_MUTEX_F:
            wme.syncOnMutexF();
            break;
        case ON_MUTEX_G:
            wme.syncOnMutexG();
            break;
        default:
            wme.syncOnThis();
            break;
        }
    }
}
