package Alex.Library;

/**
 * Created by alex on 25.11.15.
 */
public class Book {

    private String name;
    private String author;
    private int yearOfBirth;

    public Book(String name, String author, int yearOfBirth) {
        this.name = name;
        this.author = author;
        this.yearOfBirth = yearOfBirth;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", yearOfBirth=").append(yearOfBirth);
        sb.append('}');
        return sb.toString();
    }
}
