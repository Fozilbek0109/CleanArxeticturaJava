package uz.coder.cleanarxeticturajava.damain;

public class AddShopItemUsCase {
    ServiceShopItemRepository serviceShopItemRepository;

    public AddShopItemUsCase(ServiceShopItemRepository serviceShopItemRepository) {
        this.serviceShopItemRepository = serviceShopItemRepository;
    }

    public void addShopItemUsCae(ShopItem shopItem){
        serviceShopItemRepository.addShopItem(shopItem);
    }
}
