package tv.stardream.Proton.dracula.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

//JPA标识
@Entity
@Table(name = "dracula_user_perm")
public class UserPerm extends IdEntity {

	private String perm;
	private String desc;

	// JSR303 BeanValidator的校验规则
	@NotBlank
	public String getPerm() {
		return perm;
	}

	public void setPerm(String perm) {
		this.perm = perm;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
