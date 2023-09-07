package uz.coder.cleanarxeticturajava.data;

import java.util.ArrayList;
import java.util.List;

import uz.coder.cleanarxeticturajava.damain.ServiceShopItemRepository;
import uz.coder.cleanarxeticturajava.damain.ShopItem;

public class ServiceShopItemRepositoryImpl implements ServiceShopItemRepository {

    private static ServiceShopItemRepositoryImpl serviceShopItemRepository = new ServiceShopItemRepositoryImpl();
    public  static   ServiceShopItemRepositoryImpl getInstance(){
        if (serviceShopItemRepository == null){
            serviceShopItemRepository = new ServiceShopItemRepositoryImpl();
        }
        return serviceShopItemRepository;
    }

    private int autoIcrement = 0;
    private List<ShopItem> shopItemList = new ArrayList<>();
    @Override
    public void addShopItem(ShopItem shopItem) {
        if (shopItem.getId() == ShopItem.UNDEFIND_ID){
            shopItem.setId(autoIcrement);
            autoIcrement++;
        }
        shopItemList.add(shopItem);
    }

    @Override
    public void deleteShopItem(ShopItem shopItem) {
        shopItemList.remove(shopItem);
    }

    @Override
    public void editeShopItem(ShopItem shopItem) {
        shopItemList.remove(getShopItemById(shopItem.getId()));
        addShopItem(shopItem);
    }

    @Override
    public List<ShopItem> getListShopItem() {
        return shopItemList.subList(0,shopItemList.size());
    }

    @Override
    public ShopItem getShopItemById(int id) {
        return shopItemList.get(id);
    }
}
