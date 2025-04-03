package src;

import src.oop.SmartAppliance;

public class Main {
    public static void main(String[] args){
        SmartAppliance airCon = new SmartAppliance();

        // Method chaining design patter
        airCon.setApplianceName("Air Conditioner")
        .setApplianceType("HVCA")
        .setPowerStatus("On").
        setPrice(1000);

        //Creata a deep copy of the object using copy constructor
        SmartAppliance airCon2 = new SmartAppliance(airCon);
        airCon2.applyDiscount(12);

        airCon.showDetails();
        airCon2.showDetails();
    }
}
