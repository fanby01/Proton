package tv.stardream.Proton.dracula.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

//JPA标识
@Entity
@Table(name = "dracula_user_role")
public class UserRole extends IdEntity {

	private String name;


	// JSR303 BeanValidator的校验规则
	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
