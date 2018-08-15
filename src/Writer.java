import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    public void zapiszDoPliku(ArrayList<Player> players) throws IOException {
        FileWriter fileWriter = new FileWriter("status.csv");
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        for (int i = 0; i < players.size(); i++) {
            bfw.write(players.get(i).getFirstName()+";");
            bfw.write(players.get(i).getLastName()+";");
            bfw.write( String.valueOf(players.get(i).getScore())+";");
            bfw.write("\n");
        }
        bfw.close();
    }
}
