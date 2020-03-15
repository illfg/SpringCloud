package entity;

import java.io.Serializable;

public class Payment implements Serializable {

    private Integer id;
    private String content;

    public Payment(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Payment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
