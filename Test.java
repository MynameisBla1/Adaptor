public class Test extends SocketObjectAdapter {

    public static void main(String[] args) {

        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        ISocketAdapter sockAdapter = new SocketObjectAdapter();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v110 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Object Adapter="+v3.getVolts());
        System.out.println("v12 volts using Object Adapter="+v12.getVolts());
        System.out.println("v110 volts using Object Adapter="+v110.getVolts());
    }

    private static void testClassAdapter() {
        ISocketAdapter sockAdapter = new SocketClassAdapter();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v110 = getVolt(sockAdapter,110);
        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v110 volts using Class Adapter="+v110.getVolts());
    }

    private static Volt getVolt(ISocketAdapter sockAdapter, int i) {
        switch (i){
            case 3: return sockAdapter.get3Volt();
            case 12: return sockAdapter.get12Volt();
            case 110: return sockAdapter.get110Volt();
            default: return sockAdapter.get110Volt();
        }
    }
}