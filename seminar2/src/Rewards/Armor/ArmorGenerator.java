package Rewards.Armor;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class ArmorGenerator extends ItemGenerator {
    /**
     * Метод создания экземпляра продукта
     *
     * @return экземпляр продукта
     */
    @Override
    public IGameItem createItem() {
        return new ArmorRewards();
    }

    @Override
    public int getPoints() {
        return 85;
    }
}
