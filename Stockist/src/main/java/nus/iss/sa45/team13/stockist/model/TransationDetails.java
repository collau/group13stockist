package nus.iss.sa45.team13.stockist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactiondetails")
public class TransationDetails {
	
	@Id
	@Column(name="transid")
	private int transid;
	@Column(name="partnumber")
	private String partnumber;
	@Column(name="qty")
	private String qty;
	
	public TransationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransationDetails(int transid, String partnumber, String qty) {
		super();
		this.transid = transid;
		this.partnumber = partnumber;
		this.qty = qty;
	}
	public int getTransid() {
		return transid;
	}
	public void setTransid(int transid) {
		this.transid = transid;
	}
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + transid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransationDetails other = (TransationDetails) obj;
		if (transid != other.transid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TransationDetails [transid=" + transid + ", partnumber=" + partnumber + ", qty=" + qty + "]";
	}
	
	

}
