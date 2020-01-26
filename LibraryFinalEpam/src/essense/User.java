package essense;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String login;
    private String password;

    public User() {
        this.login = "Login";
        this.password = "Password";
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return password;
    }

    public void setPasword(String pasword) {
        this.password = pasword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(this.getClass() == o.getClass())) return false;
        User user = (User) o;
        return Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getPasword(), user.getPasword());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getLogin(), getPasword());
    }

    @Override
    public String toString() {
        return getClass() + "{" +
                "login='" + login + '\'' +
                ", pasword='" + password + '\'' +
                '}';
    }
}
