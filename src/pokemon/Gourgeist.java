package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;


public final class Gourgeist extends Pumpkaboo {
    public Gourgeist(String name, int level) {
        super(name, level);
        this.setStats(65, 90, 122, 58, 75, 84);

        this.addMove(new FocusBlast());
    }

}