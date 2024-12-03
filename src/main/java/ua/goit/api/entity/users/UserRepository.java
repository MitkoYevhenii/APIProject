package ua.goit.api.entity.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // JpaRepository уже предоставляет метод findById, дополнительный код не требуется
}

