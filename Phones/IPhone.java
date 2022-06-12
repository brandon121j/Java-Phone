package Phones;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
        String ring = getRingTone();
        return ring;
    }

    @Override
    public String unlock() {
        return "Unlocked";
    }

    @Override
    public void displayInfo() {
        System.out.println("Iphone " + getVersionNumber() + " on " + getCarrier() + " Battery Life is at " + getBatteryPercentage() + "%");            
    }
}

