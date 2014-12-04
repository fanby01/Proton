package tv.stardream.Proton.dracula.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//JPA标识
@Entity
@Table(name = "dracula_user_role_perm_rel")
public class UserRolePermRel extends IdEntity {

	private UserPerm perm;
	private UserRole role;

	// JSR303 BeanValidator的校验规则
	//@NotBlank
	// JPA 基于USER_ID列的多对一关系定义
	@ManyToOne
	@JoinColumn(name = "perm_id")	
	public UserPerm getUserPerm() {
		return perm;
	}

	public void setUserPerm(UserPerm perm) {
		this.perm = perm;
	}
	
	// JSR303 BeanValidator的校验规则
	//@NotBlank
	@ManyToOne
	@JoinColumn(name = "role_id")		
	public UserRole getUserRole() {
		return role;
	}

	public void setUserRole(UserRole role) {
		this.role = role;
	}

}
