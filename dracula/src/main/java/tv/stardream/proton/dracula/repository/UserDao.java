package tv.stardream.proton.dracula.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tv.stardream.proton.dracula.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
