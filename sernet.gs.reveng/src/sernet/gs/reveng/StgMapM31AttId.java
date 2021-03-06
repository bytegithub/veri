package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * StgMapM31AttId generated by hbm2java
 */
public class StgMapM31AttId implements java.io.Serializable {

	private int altId;
	private int altImpId;
	private String name;
	private int neuId;
	private int neuImpId;
	private int attId;

	public StgMapM31AttId() {
	}

	public StgMapM31AttId(int altId, int altImpId, String name, int neuId,
			int neuImpId, int attId) {
		this.altId = altId;
		this.altImpId = altImpId;
		this.name = name;
		this.neuId = neuId;
		this.neuImpId = neuImpId;
		this.attId = attId;
	}

	public int getAltId() {
		return this.altId;
	}

	public void setAltId(int altId) {
		this.altId = altId;
	}

	public int getAltImpId() {
		return this.altImpId;
	}

	public void setAltImpId(int altImpId) {
		this.altImpId = altImpId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNeuId() {
		return this.neuId;
	}

	public void setNeuId(int neuId) {
		this.neuId = neuId;
	}

	public int getNeuImpId() {
		return this.neuImpId;
	}

	public void setNeuImpId(int neuImpId) {
		this.neuImpId = neuImpId;
	}

	public int getAttId() {
		return this.attId;
	}

	public void setAttId(int attId) {
		this.attId = attId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgMapM31AttId))
			return false;
		StgMapM31AttId castOther = (StgMapM31AttId) other;

		return (this.getAltId() == castOther.getAltId())
				&& (this.getAltImpId() == castOther.getAltImpId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& (this.getNeuId() == castOther.getNeuId())
				&& (this.getNeuImpId() == castOther.getNeuImpId())
				&& (this.getAttId() == castOther.getAttId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAltId();
		result = 37 * result + this.getAltImpId();
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + this.getNeuId();
		result = 37 * result + this.getNeuImpId();
		result = 37 * result + this.getAttId();
		return result;
	}

}
