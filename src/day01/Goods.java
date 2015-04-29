package day01;

public class Goods {

	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods(){}
	
	public Goods(String name, int countStock, int countSold, int price){
		this.name = name;
		this.countSold = countSold;
		this.price = price;
		this.countStock = countStock;
	}
	@Override
	public String toString() {
		return "상품이름 = " + name + "\n가격 = " + price + "\n제고 = "
				+ countStock + "\n판매된거 = " + countSold;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
}
