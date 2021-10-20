package edu.parinya.softarchdesign.structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members = new LinkedHashSet<>();

    public void addMember(HealthcareServiceable obj) {
        this.members.add(obj);
    }

    public void removeMember(HealthcareServiceable obj) {
        this.members.remove(obj);
    }

    @Override
    public void service() {
        for (HealthcareServiceable service:this.members) {
            service.service();
        }
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (HealthcareServiceable price:this.members) {
            total += price.getPrice();
        }
        return total;
    }
}
