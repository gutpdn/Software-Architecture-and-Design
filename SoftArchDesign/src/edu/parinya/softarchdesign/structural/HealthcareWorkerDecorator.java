package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker{
    protected HealthcareServiceable worker;

    public HealthcareWorkerDecorator(HealthcareServiceable worker) {
        super((HealthcareWorker)worker);
        this.worker = worker;
        System.out.print("Decorate " + ((HealthcareWorker) worker).getName());
    }

    public void service() {
        this.worker.service();
    }

    public double getPrice(){
        return this.worker.getPrice();
    }
}
