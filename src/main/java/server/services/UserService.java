package server.services;


import org.springframework.stereotype.Service;
import server.model.User;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@SuppressWarnings("unused")
public class UserService implements UserInterface {

    private Map<Integer, User> allUsers = new HashMap<>();
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

    UserService() {
        allUsers.put(ID_GENERATOR.getAndIncrement(), new User("her", "her@mail.ru", "her"));
        allUsers.put(ID_GENERATOR.getAndIncrement(), new User("warprobot", "warprobot@mail.ru", "her"));
    }

    @Override
    public void addUser(User newUser) {
        allUsers.put(ID_GENERATOR.getAndIncrement(), newUser);
    }

    @Override
    public User getUserById(Integer id) {

        return allUsers.get(id);
    }

    @Override
    public Boolean isEmailRegistered(String email) {
        for (Map.Entry<Integer, User> user: allUsers.entrySet()) {
            User userValue = user.getValue();

            if (email.equals(userValue.getEmail())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean isLoginRegistered(String login) {
        for (Map.Entry<Integer, User> user: allUsers.entrySet()) {
            User userValue = user.getValue();
            if (login.equals(userValue.getEmail())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer authorizeUserByEmail(User tryAuth) {
        for (Map.Entry<Integer, User> user: allUsers.entrySet()) {
            User userValue = user.getValue();
            if (tryAuth.getPassword().equals(userValue.getPassword()) && tryAuth.getEmail().equals(userValue.getEmail())) {
                return user.getKey();
            }
        }
        return null;
    }
}
