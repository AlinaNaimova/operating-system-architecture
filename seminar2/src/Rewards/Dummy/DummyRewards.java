package Rewards.Dummy;

import Abstractions.IGameItem;

public class DummyRewards implements IGameItem {
    /**
     * открывать и возвращать содержимое сундука
     *
     * @return
     */
    @Override
    public String open() {
        return "Dummy";
    }
}
