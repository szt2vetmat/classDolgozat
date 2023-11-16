public class Main {
    public static void main(String[] args) {

        Kert kert = new Kert();
        kert.novenyek.add(new Virag("sárga virág", 3));
        kert.novenyek.add(new Virag("kék virág", 6));
        kert.novenyek.add(new Fa("lonc fa", 8));
        kert.novenyek.add(new Fa("narancs fa", 12));

        kert.kertAllapot();
        kert.ontoz(40);
        kert.ontoz(70);

    }
}