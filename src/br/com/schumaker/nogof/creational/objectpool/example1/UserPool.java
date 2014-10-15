package br.com.schumaker.nogof.creational.objectpool.example1;

import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class UserPool implements Pool<User> {

    private final ArrayList<User> users;

    public UserPool() {
        users = new ArrayList<>();
        users.add(new User("Hudson Schumaker"));
        users.add(new User("Humberto Schumaker"));
        users.add(new User("Hugo Schumaker"));
        users.add(new User("Henrique Schumaker"));
        users.add(new User("Hebert Schumaker"));
        users.add(new User("Hubert Schumaker"));
        users.add(new User("Helio Schumaker"));
    }

    @Override
    public User aquire() {
        if (users.size() > 0) {
            return users.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public void release(User u) {
        users.add(u);
    }
}
