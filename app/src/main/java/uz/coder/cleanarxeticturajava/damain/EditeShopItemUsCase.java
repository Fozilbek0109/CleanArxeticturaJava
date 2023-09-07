package uz.coder.cleanarxeticturajava.damain;

public class EditeShopItemUsCase {
    ServiceShopItemRepository serviceShopItemRepository;

    public EditeShopItemUsCase(ServiceShopItemRepository serviceShopItemRepository) {
        this.serviceShopItemRepository = serviceShopItemRepository;
    }
    public void editeShopItemUsCase(ShopItem shopItem){
        serviceShopItemRepository.deleteShopItem(shopItem);
    }

}
