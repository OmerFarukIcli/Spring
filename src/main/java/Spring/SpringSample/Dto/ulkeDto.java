package Spring.SpringSample.Dto;


public class ulkeDto {
	
	private String isim;
	private String bayrak;
	
	public ulkeDto() {
		
	}
	public ulkeDto(String isim, String bayrak) {
		
		this.isim = isim;
		this.bayrak = bayrak;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getBayrak() {
		return bayrak;
	}
	public void setBayrak(String bayrak) {
		this.bayrak = bayrak;
	}
	@Override
	public String toString() {
		return "ulkeDto [isim=" + isim + ", bayrak=" + bayrak + "]";
	}

}
