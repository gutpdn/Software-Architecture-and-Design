package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    public TaxPayingHealthcareWorker(HealthcareServiceable worker){
        super(worker);
        System.out.println(" with TaxPaying.");
    }

    public double getPrice(){
        return super.getPrice()*1.1;
    }
}
