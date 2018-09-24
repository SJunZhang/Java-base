package thread.executor;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyAppThread extends Thread {
    private static final Logger log = Logger.getAnonymousLogger();
    private static volatile boolean debugLifecycle = false;
    private static final AtomicInteger created = new AtomicInteger();
    private static final AtomicInteger alive = new AtomicInteger();
    public static final String DEFAULT_NAME = "MyAppThread";


    public MyAppThread(Runnable runnable, String name) {

        super(runnable, name);
        setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread t, Throwable e) {

            }
        });

    }


    @Override
    public void run() {

        boolean debug = debugLifecycle;
        if (debug == true) {
            log.log(Level.FINE, "Created" + getName());
        }

        try {
            alive.incrementAndGet();
            super.run();
        } finally {
            alive.decrementAndGet();
        }


    }
}
