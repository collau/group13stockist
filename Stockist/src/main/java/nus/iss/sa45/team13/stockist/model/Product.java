package nus.iss.sa45.team13.stockist.model;

public class Product {
	
	private int partnumber;
	private String partName;
	private double unitPrice;
	private String description;
	private String color;
	private double dimension;
	private int supplierid;
	private int reorderpoint;
	private int minorder;
	private String shelfLocation;
	private String category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(int partnumber, String partName, double unitPrice, String description, String color,
			double dimension, int supplierid, int reorderpoint, int minorder, String shelfLocation, String category) {
		super();
		this.partnumber = partnumber;
		this.partName = partName;
		this.unitPrice = unitPrice;
		this.description = description;
		this.color = color;
		this.dimension = dimension;
		this.supplierid = supplierid;
		this.reorderpoint = reorderpoint;
		this.minorder = minorder;
		this.shelfLocation = shelfLocation;
		this.category = category;
	}



	public int getPartnumber() {
		return partnumber;
	}

	public void setPartnumber(int partnumber) {
		this.partnumber = partnumber;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public int getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}

	public int getReorderpoint() {
		return reorderpoint;
	}

	public void setReorderpoint(int reorderpoint) {
		this.reorderpoint = reorderpoint;
	}

	public int getMinorder() {
		return minorder;
	}

	public void setMinorder(int minorder) {
		this.minorder = minorder;
	}

	public String getShelfLocation() {
		return shelfLocation;
	}

	public void setShelfLocation(String shelfLocation) {
		this.shelfLocation = shelfLocation;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [partnumber=" + partnumber + ", partName=" + partName + ", unitPrice=" + unitPrice
				+ ", description=" + description + ", color=" + color + ", dimension=" + dimension + ", supplierid="
				+ supplierid + ", reorderpoint=" + reorderpoint + ", minorder=" + minorder + ", shelfLocation="
				+ shelfLocation + ", category=" + category + "]";
	}

	
	
	
}
