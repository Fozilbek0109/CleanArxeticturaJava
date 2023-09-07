package uz.coder.cleanarxeticturajava.damain;

import java.util.List;

public class GetListShopItemUsCase {
    ServiceShopItemRepository serviceShopItemRepository;

    public GetListShopItemUsCase(ServiceShopItemRepository serviceShopItemRepository) {
        this.serviceShopItemRepository = serviceShopItemRepository;
    }

    public List<ShopItem> getListShopItemUsCase(){
        return serviceShopItemRepository.getListShopItem();
    }

}
