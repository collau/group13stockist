package nus.iss.sa45.team13.stockist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productdata")
public class Product {
	@Id
	@Column(name = "partnumber")
	private int partNumber;
	
	@Column(name = "partname")
	private String partName;
	
	@Column(name = "unitprice")
	private double unitPrice;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "dimension")
	private double dimension;
	
	@Column(name = "supplierid")
	private int supplierId;
	
	@Column(name = "reorderpoint")
	private int reorderPoint;
	
	@Column(name = "minorder")
	private int minOrder;
	
	@Column(name = "shelflocation")
	private String shelfLocation;
	
	@Column(name = "category")
	private String category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int partNumber, String partName, double unitPrice, String description, String color,
			double dimension, int supplierid, int reorderpoint, int minorder, String shelfLocation, String category) {
		super();
		this.partNumber = partNumber;
		this.partName = partName;
		this.unitPrice = unitPrice;
		this.description = description;
		this.color = color;
		this.dimension = dimension;
		this.supplierId = supplierid;
		this.reorderPoint = reorderpoint;
		this.minOrder = minorder;
		this.shelfLocation = shelfLocation;
		this.category = category;
	}



	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
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

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getReorderPoint() {
		return reorderPoint;
	}

	public void setReorderPoint(int reorderPoint) {
		this.reorderPoint = reorderPoint;
	}

	public int getMinOrder() {
		return minOrder;
	}

	public void setMinOrder(int minOrder) {
		this.minOrder = minOrder;
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
		return "Product [partnumber=" + partNumber + ", partName=" + partName + ", unitPrice=" + unitPrice
				+ ", description=" + description + ", color=" + color + ", dimension=" + dimension + ", supplierid="
				+ supplierId + ", reorderpoint=" + reorderPoint + ", minorder=" + minOrder + ", shelfLocation="
				+ shelfLocation + ", category=" + category + "]";
	}

	
}
