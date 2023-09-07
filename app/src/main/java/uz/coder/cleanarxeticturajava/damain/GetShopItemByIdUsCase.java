package uz.coder.cleanarxeticturajava.damain;

public class GetShopItemByIdUsCase {
    ServiceShopItemRepository serviceShopItemRepository;

    public GetShopItemByIdUsCase(ServiceShopItemRepository serviceShopItemRepository) {
        this.serviceShopItemRepository = serviceShopItemRepository;
    }
    public ShopItem getShopItemByIdUsCase(int id){
        return serviceShopItemRepository.getShopItemById(id);
    }



}
