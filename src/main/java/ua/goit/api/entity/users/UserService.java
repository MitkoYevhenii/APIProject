package ua.goit.api.entity.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User findByUsername(String username) {
        return repository.findById(username).orElse(null);
    }

    public void saveUser(User user) {
        repository.save(user);
    }
}

