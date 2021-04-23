package FacadeDesignPattern;

public class ShopKeeper {

	private MobileShop iphone;
	private MobileShop xaomi;
	private MobileShop oppo;
	
	public ShopKeeper() {
		iphone=new Iphone();
		xaomi=new Xaomi();
		oppo=new Oppo();
	}
	
	public void iphoneDetails() {
		iphone.mobileName();
		iphone.price();
	}
	public void oppoDetails() {
		oppo.mobileName();
		oppo.price();
	}
	public void xaomiDetails() {
		xaomi.mobileName();
		xaomi.price();
	}
}
