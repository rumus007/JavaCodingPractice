package src.oop;

public class SmartAppliance {
    private String applianceName;
    private String applianceType;
    private String powerStatus;
    private double price;

    // Default constructor
    public SmartAppliance(){

    }
    // Copy constructor
    public SmartAppliance(SmartAppliance copyInstance){
        this.applianceName = copyInstance.applianceName;
        this.applianceType = copyInstance.applianceType;
        this.powerStatus = copyInstance.powerStatus;
        this.price = copyInstance.price;
    }

    public SmartAppliance setApplianceName(String applianceName) {
        this.applianceName = applianceName;
        return this;
    }

    public SmartAppliance setApplianceType(String applianceType) {
        this.applianceType = applianceType;
        return this;
    }

    public SmartAppliance setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
        return this;
    }

    public SmartAppliance setPrice(int price) {
        this.price = price;
        return this;
    }

    public void applyDiscount(double discount){
        this.price -= this.price*(discount/100);
    }

    public void showDetails(){
        System.out.println("Appliance name: " + applianceName);
        System.out.println("Appliance type: " + applianceType);
        System.out.println("Appliance name: " + powerStatus);
        System.out.println("Appliance Price: " + price);
        System.out.println("========================");
    }
}
