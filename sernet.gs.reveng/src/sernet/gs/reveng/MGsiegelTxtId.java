package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * MGsiegelTxtId generated by hbm2java
 */
public class MGsiegelTxtId implements java.io.Serializable {

	private short gruId;
	private short sprId;

	public MGsiegelTxtId() {
	}

	public MGsiegelTxtId(short gruId, short sprId) {
		this.gruId = gruId;
		this.sprId = sprId;
	}

	public short getGruId() {
		return this.gruId;
	}

	public void setGruId(short gruId) {
		this.gruId = gruId;
	}

	public short getSprId() {
		return this.sprId;
	}

	public void setSprId(short sprId) {
		this.sprId = sprId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MGsiegelTxtId))
			return false;
		MGsiegelTxtId castOther = (MGsiegelTxtId) other;

		return (this.getGruId() == castOther.getGruId())
				&& (this.getSprId() == castOther.getSprId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGruId();
		result = 37 * result + this.getSprId();
		return result;
	}

}
