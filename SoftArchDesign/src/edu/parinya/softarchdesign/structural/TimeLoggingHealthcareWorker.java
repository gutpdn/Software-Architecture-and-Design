package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator{

    public TimeLoggingHealthcareWorker(HealthcareServiceable worker){
        super(worker);
        System.out.println(" with TimeLogging.");
    }

    public void service() {
        Date time = new Date();
        System.out.print(time.toString() + ": ");
        super.service();
    }
}
