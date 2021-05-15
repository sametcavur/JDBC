package Personal;

public class Personal {
	private int personalID;
	private String adi;
	private String soyadi;
	private int dogumYili;
	private int personalNo;
	
	public Personal() {
		
	}

	public Personal(int personalID, String adi, String soyadi, int dogumYili, int personalNo) {
		super();
		this.personalID = personalID;
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumYili = dogumYili;
		this.personalNo = personalNo;
	}

	public int getPersonalID() {
		return personalID;
	}

	public void setPersonalID(int personalID) {
		this.personalID = personalID;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	public int getPersonalNo() {
		return personalNo;
	}

	public void setPersonalNo(int personalNo) {
		this.personalNo = personalNo;
	}

	@Override
	public String toString() {
		return "Personal [personalID=" + personalID + ", adi=" + adi + ", soyadi=" + soyadi + ", dogumYili=" + dogumYili
				+ ", personalNo=" + personalNo + "]";
	}
	
	
	
}