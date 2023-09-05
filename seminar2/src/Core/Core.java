/**
 * Основной класс игры, содержащий методы для запуска и логики игры.
 */
package Core;

import Abstractions.ItemGenerator;
import Rewards.Armor.ArmorGenerator;
import Rewards.Dummy.DummyGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Heart.HeartGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core {
    private Random rnd = new Random();

    /**
     * Логика игры
     */
    public void run() {
        // Создание списка генераторов наград
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new ArmorGenerator());
        generatorList.add(new DummyGenerator());
        generatorList.add(new HeartGenerator());

        // Выбор случайного генератора наград
        Random random = new Random();
        ItemGenerator generator = generatorList.get(random.nextInt(generatorList.size()));

        // Вывод информации о полученной награде
        System.out.println("You got a box of " + generator.openReward() + "! It brings " + generator.getPoints() + "% of points.");
    }

}
