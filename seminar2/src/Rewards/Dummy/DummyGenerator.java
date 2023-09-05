package Rewards.Dummy;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class DummyGenerator extends ItemGenerator {
    /**
     * Метод создания экземпляра продукта
     *
     * @return экземпляр продукта
     */
    @Override
    public IGameItem createItem() {
        return new DummyRewards();
    }

    @Override
    public int getPoints() {
        return 5;
    }
}
