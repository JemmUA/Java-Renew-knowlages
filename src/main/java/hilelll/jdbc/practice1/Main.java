package hilelll.jdbc.practice1;

import hilelll.jdbc.practice1.entity.User;
import hilelll.jdbc.practice1.service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Connection connection = Databese.getConnection();
        UserService userService = new UserService();
        List<User> users = userService.getAll();
        users.forEach(System.out::println);

        User user = new User();
        user.setName("Igor");
        user.setSurname("Petrenko");
        user.setEmail("igor@mail.ua");
        user.setPassword("hfuieh476876w(");
        user.setAge(22);

        userService.save(user);
    }
}
