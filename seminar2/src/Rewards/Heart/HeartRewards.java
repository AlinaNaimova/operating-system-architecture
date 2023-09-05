package Rewards.Heart;

import Abstractions.IGameItem;

public class HeartRewards implements IGameItem {
    /**
     * открывать и возвращать содержимое сундука
     *
     * @return
     */
    @Override
    public String open() {
        return "Heart";
    }
}
