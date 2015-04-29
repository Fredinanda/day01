package day01;

public class goodsMain {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(30000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		System.out.println(camera);
		
		Goods good2 = new Goods("글쌔",100,1,34);
		
		System.out.println(good2);

	}

}
