public class AdapterCharger implements AppleCharger{

    private AndroidCharger charger;

    public AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargerAndroidPhone();
        System.out.println("your phone is charging with adapter");
    }
    
}
