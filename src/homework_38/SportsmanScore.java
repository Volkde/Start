package homework_38;

import homework_38.Sportsman;

import java.util.Comparator;

public class SportsmanScore implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {

        return Integer.compare(sportsman1.getScore(), sportsman2.getScore());

    }

}