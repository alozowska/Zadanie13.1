import java.util.Comparator;

public class LastNameComparator implements Comparator<Player> {
    @Override
    public int compare( Player g1, Player g2) {
        if (g1.getLastName().compareTo(g2.getLastName())>0)
            return 1;
        else if (g1.getLastName().compareTo(g2.getLastName())<0)
            return -1;
        return 0;
    }
}
