package Rewards.Heart;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class HeartGenerator extends ItemGenerator {
    /**
     * Метод создания экземпляра продукта
     *
     * @return экземпляр продукта
     */
    @Override
    public IGameItem createItem() {
        return new HeartRewards();
    }

    @Override
    public int getPoints() {
        return 100;
    }
}
