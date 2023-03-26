package Lesson8_tasks;

public class Lesson8_task2 {
    public class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String login(String enteredUsername, String enteredPassword) {
            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                return "Username and password match";
            } else {
                return "Username or password do not match";
            }
        }
    }

    public void main(String[] args) {
        User user = new User("Ivan", "password");

        String result = user.login("Ivan", "password");
        System.out.println(result);
    }
}
