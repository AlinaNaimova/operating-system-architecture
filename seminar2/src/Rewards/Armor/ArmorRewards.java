package Rewards.Armor;

import Abstractions.IGameItem;

public class ArmorRewards implements IGameItem {

    /**
     * открывать и возвращать содержимое сундука
     *
     * @return
     */
    @Override
    public String open() {
        return "Armor";
    }

}
