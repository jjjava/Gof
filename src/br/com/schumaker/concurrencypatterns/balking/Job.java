
package br.com.schumaker.concurrencypatterns.balking;

/**
 *
 * @author hudson.sales
 */
public class Job {

    private boolean jobInProgress = false;

    public void execute() {
        synchronized (this) {
            if (jobInProgress) {
                System.out.println("Job running...");
                return;
            }
            jobInProgress = true;
        }

        for (int k = 0; k < 10000; k++) {
            System.out.println( k);
        }
    }

    void jobCompleted() {
        synchronized (this) {
            jobInProgress = false;
            System.out.println("Job complete.");
        }
    }
}
