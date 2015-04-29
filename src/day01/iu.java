package day01;

public class iu {

	public static void main(String[] args) {
		Song iulove = new Song();
		
		iulove.setAlbum("Real");
		iulove.setArtist("아이유");
		iulove.setComposer("윤민수");
		iulove.setTitle("좋은날");
		iulove.setTrack(3);
		iulove.setYear(2002);
		
		iulove.show();

		Song eve = new Song("굿바이","이브","Goodbye","이브",2000,1);
		eve.show();
	}

}
