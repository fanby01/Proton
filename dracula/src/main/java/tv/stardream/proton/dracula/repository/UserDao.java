package tv.stardream.Proton.dracula.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tv.stardream.Proton.dracula.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
