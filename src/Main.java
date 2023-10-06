public class Main {

    public static void main(String[] args) {

        NameManager person = new NameManager();
        person.getName("Matthias", "Mulser");
        person.printName();


        Umfangrechner rechner = new Umfangrechner();
        int value = rechner.getUmfang(5, 2);
        System.out.println(value);
    }
}
