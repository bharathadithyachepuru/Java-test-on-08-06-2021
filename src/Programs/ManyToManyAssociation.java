package Programs;

class StudyMaterial {
	
	private String bookpublisher;
	private int numberofpages;
	private String  bookname;
	
	public String getBookPublisher() {
		return bookpublisher;
	}
	
	public void setBookPublisher(String bookpublisher) {
		
		this.bookpublisher = bookpublisher;
	}
	
	public int getNoOfPages() {
		
		return numberofpages;
	}
	
	public void setNoOfPages(int numberofpages) {
		
		this.numberofpages = numberofpages;
		
	}
	
	public String getBookName() {
		
		return bookname;
	}
	
	public void setBookName(String bookname) {
		
		this.bookname = bookname;
	}
	
}

class Trainee {
	
	private String traineename;
	private int bookcost;
	private String purchasedshop;
	
	public String getTraineeName() {
		
		return traineename;
	}
	
	public void setTraineeName(String traineename) {
		
		this.traineename = traineename;
		
	}
	
	public int getBookCost() {
		
		return bookcost;
	}
	
	public void setBookCost(int bookcost) {
		
		this.bookcost = bookcost;
		
	}
	
	public String getPurchasedShop() {
		
		return purchasedshop;
	}
	
	public void setPurchasedShop(String purchasedshop) {
		
		this.purchasedshop = purchasedshop;
	}
}

public class ManyToManyAssociation {

	public static void main(String[] args) {

	StudyMaterial sm = new StudyMaterial();
	
	sm.setBookPublisher("RS Enterprises");
	sm.setNoOfPages(500);
	sm.setBookName("Physics text book");
	
	StudyMaterial sm1 = new StudyMaterial();
	sm1.setBookPublisher("BA Enterprises");
	sm1.setNoOfPages(350);
	sm1.setBookName("English textbook");
	
	StudyMaterial sm2 = new StudyMaterial();
	sm2.setBookPublisher("MR Enterprises");
	sm2.setNoOfPages(400);
	sm2.setBookName("Biology text book");
	
	Trainee tn = new Trainee();
	tn.setTraineeName("Bharath");
	tn.setBookCost(200);
	tn.setPurchasedShop("Pasumarthy ranga rao book stall");
	
	Trainee tn1 = new Trainee();
	tn1.setTraineeName("Kareem");
	tn1.setBookCost(300);
	tn1.setPurchasedShop("Srinivasa book stall");
	
	Trainee tn2 = new Trainee();
	tn2.setTraineeName("Sumanth");
	tn2.setBookCost(250);
	tn2.setPurchasedShop("Hanuman book stall");
	
	System.out.println(tn.getTraineeName()+" Purchased"+sm1.getBookName()+" cost of the book is"+tn.getBookCost()
	                     +" and purchased in"+tn.getPurchasedShop()+" No of pages in that book are"+sm1.getNoOfPages()
	                        +" aPublished by"+sm1.getBookPublisher());
	

	}

}
