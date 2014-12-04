package tv.stardream.Proton.dracula.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import tv.stardream.Proton.dracula.entity.UserPerm;

public interface UserPermDao extends PagingAndSortingRepository<UserPerm, Long>, JpaSpecificationExecutor<UserPerm> {

}
