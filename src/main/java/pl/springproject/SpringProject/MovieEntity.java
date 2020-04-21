package pl.springproject.SpringProject;

import javax.persistence.*;

@Entity
@Table(name = "image_model2")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private char[] description;
    private float imdbrating;
    private int year;
    private String imageName;

    public MovieEntity() {
    }

    public MovieEntity(String title, char[] description, float imdbrating, int year, String imageName) {
        this.title = title;
        this.description = description;
        this.imdbrating = imdbrating;
        this.year = year;
        this.imageName = imageName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char[] getDescription() {
        return description;
    }

    public void setDescription(char[] description) {
        this.description = description;
    }

    public float getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(float imdbrating) {
        this.imdbrating = imdbrating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}