package Abstractions;
//Абстракция класса фабрики
public abstract class ItemGenerator {
    /**
     * Метод взаимодействия с абстрактной продукцией
     * @return содержимое из разных сундуков
     */
    public String openReward(){
        IGameItem gameItem = createItem();
        return gameItem.open();
    }

    /**
     * Метод создания экземпляра продукта
     * @return экземпляр продукта
     */
    public abstract IGameItem createItem();

    /**
     * Метод получения количества очков за предмет
     * @return количество очков
     */
    public abstract int getPoints();

}