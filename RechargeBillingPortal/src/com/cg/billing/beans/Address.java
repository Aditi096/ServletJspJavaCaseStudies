package com.cg.billing.beans;
import javax.persistence.Embeddable;
@Embeddable
public class Address {
	private String homeAddresscity, homeAddresSstate;
	private int homePinCode;
	private String billingAddresscity, billingAddresSstate;
	private int billingPinCode;
	public Address() {}
	public Address(String homeAddresscity, String homeAddresSstate, int homePinCode, String billingAddresscity,
			String billingAddresSstate, int billingPinCode) {
		super();
		this.homeAddresscity = homeAddresscity;
		this.homeAddresSstate = homeAddresSstate;
		this.homePinCode = homePinCode;
		this.billingAddresscity = billingAddresscity;
		this.billingAddresSstate = billingAddresSstate;
		this.billingPinCode = billingPinCode;
	}
	public String getHomeAddresscity() {
		return homeAddresscity;
	}
	public void setHomeAddresscity(String homeAddresscity) {
		this.homeAddresscity = homeAddresscity;
	}
	public String getHomeAddresSstate() {
		return homeAddresSstate;
	}
	public void setHomeAddresSstate(String homeAddresSstate) {
		this.homeAddresSstate = homeAddresSstate;
	}
	public int getHomePinCode() {
		return homePinCode;
	}
	public void setHomePinCode(int homePinCode) {
		this.homePinCode = homePinCode;
	}
	public String getBillingAddresscity() {
		return billingAddresscity;
	}
	public void setBillingAddresscity(String billingAddresscity) {
		this.billingAddresscity = billingAddresscity;
	}
	public String getBillingAddresSstate() {
		return billingAddresSstate;
	}
	public void setBillingAddresSstate(String billingAddresSstate) {
		this.billingAddresSstate = billingAddresSstate;
	}
	public int getBillingPinCode() {
		return billingPinCode;
	}
	public void setBillingPinCode(int billingPinCode) {
		this.billingPinCode = billingPinCode;
	}
	@Override
	public String toString() {
		return "Address [homeAddresscity=" + homeAddresscity + ", homeAddresSstate=" + homeAddresSstate
				+ ", homePinCode=" + homePinCode + ", billingAddresscity=" + billingAddresscity
				+ ", billingAddresSstate=" + billingAddresSstate + ", billingPinCode=" + billingPinCode + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billingAddresSstate == null) ? 0 : billingAddresSstate.hashCode());
		result = prime * result + ((billingAddresscity == null) ? 0 : billingAddresscity.hashCode());
		result = prime * result + billingPinCode;
		result = prime * result + ((homeAddresSstate == null) ? 0 : homeAddresSstate.hashCode());
		result = prime * result + ((homeAddresscity == null) ? 0 : homeAddresscity.hashCode());
		result = prime * result + homePinCode;
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
		Address other = (Address) obj;
		if (billingAddresSstate == null) {
			if (other.billingAddresSstate != null)
				return false;
		} else if (!billingAddresSstate.equals(other.billingAddresSstate))
			return false;
		if (billingAddresscity == null) {
			if (other.billingAddresscity != null)
				return false;
		} else if (!billingAddresscity.equals(other.billingAddresscity))
			return false;
		if (billingPinCode != other.billingPinCode)
			return false;
		if (homeAddresSstate == null) {
			if (other.homeAddresSstate != null)
				return false;
		} else if (!homeAddresSstate.equals(other.homeAddresSstate))
			return false;
		if (homeAddresscity == null) {
			if (other.homeAddresscity != null)
				return false;
		} else if (!homeAddresscity.equals(other.homeAddresscity))
			return false;
		if (homePinCode != other.homePinCode)
			return false;
		return true;
	}
	
}