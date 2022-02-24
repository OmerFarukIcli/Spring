package Spring.SpringSample.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FifaWorldCup")
public class Ulkeler extends BaseEntity{
	
	@Id
	@SequenceGenerator(name="fifa",sequenceName="world",initialValue=10,allocationSize=10)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="fifa")
	private int id;
	@Column(name="name",length=150)
	private String isim;
	@Column(name="flag",length=50)
	private String bayrak;
	
	public Ulkeler() {
		
	}
	public Ulkeler(int id, String isim, String bayrak) {
		this.id = id;
		this.isim = isim;
		this.bayrak = bayrak;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "ulkeler [id=" + id + ", isim=" + isim + ", bayrak=" + bayrak + "]";
	}
	

}
