class Demo{
    public static void main(String[] args){
        System.out.println("program started");
        // AppleCharger appleCharger = new ChargerXYZ();
        // IPhone13 iPhone13 = new IPhone13(appleCharger);
        AppleCharger charger = new AdapterCharger(new DKCharger());
        IPhone13 iPhone13 = new IPhone13(charger);
        iPhone13.chargeIPhone();
    }
}