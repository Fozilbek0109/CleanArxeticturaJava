package uz.coder.cleanarxeticturajava.damain;

public class DeleteShopItemUsCase {
    ServiceShopItemRepository serviceShopItemRepository;

    public DeleteShopItemUsCase(ServiceShopItemRepository serviceShopItemRepository) {
        this.serviceShopItemRepository = serviceShopItemRepository;
    }
    public void deleteShopItemUsCase(ShopItem shopItem){
        serviceShopItemRepository.deleteShopItem(shopItem);
    }
}
