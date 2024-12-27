public class Main {
    public static void main(String[] args) {

        Gamer gamer0 = new Gamer("Стасян2000", true);
        Gamer gamer1 = new Gamer("DjEban", true);
        Gamer gamer2 = new Gamer("vovchikYbivaka", true);
        Gamer gamer3 = new Gamer("Morshuuu", false);
        Gamer gamer4 = new Gamer("Milaxa", false);
        Gamer gamer5 = new Gamer("Lyumis", false);
        System.out.println(gamer0);

        Gamer[] gamersArray = new Gamer[5];
        gamersArray[0] = gamer1;
        gamersArray[1] = gamer2;
        gamersArray[2] = gamer3;
        gamersArray[3] = gamer4;
        gamersArray[4] = gamer5;

        for (Gamer gamer : gamersArray) {
            if (gamer.isActive()) {
                System.out.println(gamer);
            }
        }
    }
}
