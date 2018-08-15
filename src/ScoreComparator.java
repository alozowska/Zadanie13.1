import java.util.Comparator;

public class ScoreComparator implements Comparator<Player> {
    @Override
    public int compare(Player g1, Player g2) {
        if(g1.getScore()>g2.getScore())
           return  1;
       else if (g1.getScore()<g2.getScore())
           return -1;
       return 0;
    }
}
