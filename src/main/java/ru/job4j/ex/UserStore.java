package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User[] result = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                result[count] = users[i];
            } else {
                result[count] = null;
            }
        }
        if (result[count] != null) {
            return result[count];
        }
        throw new UserNotFoundException("User not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() > 3 && user.isValid()) {
            return true;
        }
        throw new UserInvalidException("User not access");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UserInvalidException ivld) {
            throw new RuntimeException(ivld);
        }
    }
}