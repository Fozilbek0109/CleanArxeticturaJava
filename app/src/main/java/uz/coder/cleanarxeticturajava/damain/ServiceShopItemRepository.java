package uz.coder.cleanarxeticturajava.damain;

import java.util.List;

public interface ServiceShopItemRepository {
    void addShopItem(ShopItem shopItem);
    void deleteShopItem(ShopItem shopItem);
    void editeShopItem(ShopItem shopItem);
    List<ShopItem> getListShopItem();
    ShopItem getShopItemById(int id);

}
