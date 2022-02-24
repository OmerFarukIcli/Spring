package Spring.SpringSample.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class BaseEntity implements Serializable {
	
	private Date createDate;
	private String createName;
	private Date updateDate;
	private String updateName;
	public BaseEntity() {
		
	}
	
	public BaseEntity(Date createDate, String createName, Date updateDate, String updateName) {
		this.createDate = createDate;
		this.createName = createName;
		this.updateDate = updateDate;
		this.updateName = updateName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	@Override
	public String toString() {
		return "BaseEntity [createDate=" + createDate + ", createName=" + createName + ", updateDate=" + updateDate
				+ ", updateName=" + updateName + "]";
	}
	
	

}
