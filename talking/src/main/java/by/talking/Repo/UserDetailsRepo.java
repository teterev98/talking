package by.talking.Repo;

import by.talking.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo  extends JpaRepository<User, String> {
}
