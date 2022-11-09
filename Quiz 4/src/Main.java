import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        Player pikachu = new Player(25, "Pikachu", 1);
        Player celebi = new Player(251, "Celebi", 2);
        Player hitmonchan = new Player(107, "Hitmonchan", 3);
        Player mankey = new Player(56, "Mankey", 4);
        Player starmie = new Player(175, "Starmie", 4);
        Player gardevoir = new Player(21, "Gardevoir", 10);
        Player jigglypuff = new Player(59, "Jigglypuff", 3);
        Player blastoise = new Player(61, "Blastoise", 9);

        SimpleHashtable hashtable = new SimpleHashtable();

        // add initial players
        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(hitmonchan.getUserName(), hitmonchan);
        hashtable.put(starmie.getUserName(), starmie);
        hashtable.put(gardevoir.getUserName(), gardevoir);
        hashtable.put(jigglypuff.getUserName(), jigglypuff);
        hashtable.put(blastoise.getUserName(), blastoise);

        while (loop == true){
            // print the contents of the hashtable
            hashtable.printHashtable();

            // remove inputted userName from hashtable
            System.out.println("\nInput any given user to remove (case sensitive):");
            String userName = scanner.nextLine();
            hashtable.remove(userName);

            System.out.println("Input any character to continue:");
            scanner.nextLine();
            System.out.print("\n");
        }

        // get a value based on a given key
        //System.out.println(hashtable.get("Mankey"));
    }
}