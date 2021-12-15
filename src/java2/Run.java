package java2;

public class Run {

	public static void main(String[] args) {
//		Pet p = new Pet();
		Pet p1 = new Pet("½Ãº£¸®¾ÈÇã½ºÅ°", "¹Ì¹Ì", 1);
		Pet p2 = new Pet("Çªµé", "Çª´Ï", 2);
		Pet p3 = new Pet("Áøµ¾°³", "Àå±º", 2);
		
		System.out.println("Æê Á¾·ù : " + p1.getPetType() +
							"Æê ÀÌ¸§ : " + p1.getPetName() +
							"Æê ³ªÀÌ : " + p1.getPetAge());	
		
		System.out.println("Æê Á¾·ù : " + p2.getPetType() +
				"Æê ÀÌ¸§ : " + p2.getPetName() +
				"Æê ³ªÀÌ : " + p2.getPetAge());	
		
		System.out.println("Æê Á¾·ù : " + p3.getPetType() +
				"Æê ÀÌ¸§ : " + p3.getPetName() +
				"Æê ³ªÀÌ : " + p3.getPetAge());	
	}

}
