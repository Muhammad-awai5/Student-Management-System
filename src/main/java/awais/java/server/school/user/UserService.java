package awais.java.server.school.user;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long userID);
    User createUser(User user);
    void deleteUser(Long userID);
}
