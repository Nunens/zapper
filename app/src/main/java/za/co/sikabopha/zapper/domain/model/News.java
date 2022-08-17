package za.co.sikabopha.zapper.domain.model;

import java.util.Date;

import za.co.sikabopha.zapper.data.dto.NewsDTO;

public class News {
    private int id;
    private String title;
    private String content;
    private Date date;

    public News(NewsDTO news) {
        this.id = news.getId();
        this.title = news.getTitle();
        this.content = news.getContent();
        this.date = new Date(Date.parse(news.getDate()));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
