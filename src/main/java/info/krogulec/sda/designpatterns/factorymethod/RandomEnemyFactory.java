package info.krogulec.sda.designpatterns.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomEnemyFactory implements EnemyFactory{

    private final Map<Integer, Class<? extends Enemy>> enemies = new HashMap<>();
    private final Random random;

    public RandomEnemyFactory() {
        this.random = new Random();
        enemies.put(0, Psycho.class);
        enemies.put(1, Soldier.class);
        enemies.put(2, Zombie.class);
    }

    @Override
    public Enemy createEnemy() {
        int enemyKey = random.nextInt(3);
        final Class<? extends Enemy> enemyClass = enemies.get(enemyKey);
        Enemy enemy = null;

        try {
            enemy = enemyClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return enemy;
    }
}
