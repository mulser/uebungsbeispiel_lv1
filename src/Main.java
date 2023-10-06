public class Main {

    public static void main(String[] args) {

        NameManager person = new NameManager();
        person.getName("Matthias", "Mulser");
        person.printName();


        Umfangrechner rechner = new Umfangrechner();
        int value = rechner.getUmfang(5, 2);
        System.out.println(value);

        MethodenDemo newDemo = new MethodenDemo();
        newDemo.printShit(20, "Test");

        ZinsDemo bank = new ZinsDemo();
        bank.initKonto("Matthias", 1000);
        bank.calculate(3, 5.00);
        bank.kontoStand();
    }
}
