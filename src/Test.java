import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String stop = "stop";
        System.out.println("podaj wynik gracza (lub stop)");
        String line = scanner.nextLine();
        ArrayList<Player> players = new ArrayList<>();
        String[] dane = new String[3];
        while (!line.equals(stop)) {
            System.out.println("podaj wynik gracza (lub stop)");
            dane = line.split(" ");
            players.add(new Player(dane[0],dane[1],Double.parseDouble(dane[2])));
            line=scanner.nextLine();
        }
        System.out.println("podaj kryterium sortowania");
        String kryterium = scanner.nextLine();
        if (kryterium.equals("imię")) {
            Collections.sort(players);
            System.out.println(players);
        } else if (kryterium.equals("nazwisko")) {
            LastNameComparator lastNameComparator = new LastNameComparator();
            Collections.sort(players, lastNameComparator);
            System.out.println(players);
        } else if (kryterium.equals("wynik")) {
            ScoreComparator scoreComparator = new ScoreComparator();
            Collections.sort(players, scoreComparator);
            System.out.println(players);
        }
        Writer writer=new Writer();
        writer.zapiszDoPliku(players);
    }
}

