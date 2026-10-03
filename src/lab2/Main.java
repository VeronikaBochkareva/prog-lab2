package lab2;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Palkia palkia = new Palkia("Космос", 30);
        Pumpkaboo pumpkaboo = new Pumpkaboo("Тыковка", 30);
        Gloom gloom = new Gloom("Лютик", 30);
        Gourgeist gourgeist = new Gourgeist("Кошмар", 30);
        Oddish oddish = new Oddish("Малыш", 30);
        Bellossom bellossom = new Bellossom("Роза", 30);

        b.addAlly(palkia);
        b.addAlly(pumpkaboo);
        b.addAlly(gloom);

        b.addFoe(gourgeist);
        b.addFoe(oddish);
        b.addFoe(bellossom);

        b.go();
    }
}
