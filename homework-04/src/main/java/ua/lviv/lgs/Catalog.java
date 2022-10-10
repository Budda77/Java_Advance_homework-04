package ua.lviv.lgs;

public class Catalog {
	private String catalogName;
	private String frequency;
	private int price;
	
	public Catalog(String catalogName, String frequency, int price) {
		super();
		this.catalogName = catalogName;
		this.frequency = frequency;
		this.price = price;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Catalog [catalogName=" + catalogName + ", frequency=" + frequency + ", price=" + price + "]";
	}

	

}
