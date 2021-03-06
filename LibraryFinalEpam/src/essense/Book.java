package essense;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private String name;
    private String author;

    public Book() {
        this.author="None";
        this.name="None";
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null) return false;
        if (!(o.getClass() == this.getClass())) return false;
        Book book = (Book) o;
        return Objects.equals(getName(), book.getName()) &&
                Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {

        return (int)31*((name==null)?0:name.hashCode())+((author==null)?0:author.hashCode());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
