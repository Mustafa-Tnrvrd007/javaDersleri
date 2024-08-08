package java102.P_1_MaceraOyunu.Characters;

import java.util.Random;

public class Snake extends Obstacle {

    public Snake() {

        super(18, "Yilan", 0, 12, 0);
        super.setISGood(false);
        // super.setObsNumber(getObsNumber()+3); // 3 ile 6 arasında obstacle
        super.setDamage(randomDamage());

    }

    public int randomDamage() { // yilanın hasarını 3 ile 6 arasında rastgele
        Random random = new Random(); //random sınıfı
        int damage = random.nextInt(4); // 0 1 2 3
        return damage + 3; // 3 4 5 6
    }


}
