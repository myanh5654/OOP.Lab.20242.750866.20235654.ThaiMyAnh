package hust.soict.elitech.aims.disc;

public class DigitalVideoDisc {	 
	    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

		// Khai báo các thuộc tính của DVD
	    private String title;
	    private String category;
	    private String director;
	    private int length;
	    private float cost;
	    
	    // Constructor mặc định (nếu cần)
	    public DigitalVideoDisc() {
	    }
	    
	    // Constructor đầy đủ để khởi tạo các thuộc tính
	    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	        this.title = title;
	        this.category = category;
	        this.director = director;
	        this.length = length;
	        this.cost = cost;
	    }
	    
	    // Các phương thức getter (sau này bạn sẽ tạo accessors tự động nếu cần)
	    public String getTitle() {
	        return title;
	    }
	    
	    public String getCategory() {
	        return category;
	    }
	    
	    public String getDirector() {
	        return director;
	    }
	    
	    public int getLength() {
	        return length;
	    }
	    
	    public float getCost() {
	        return cost;
	    }
	}

}
