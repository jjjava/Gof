package br.com.schumaker.nogof.creational.objectpool.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class Client {

    public static void main(String[] args) {
        Pool<User> userPool = new UserPool();
        User user = userPool.aquire();
        while (user != null) {
            System.out.println(user.getName());
            //userPool.release(user); infinity loop
            user = userPool.aquire();
        }
    }
}
