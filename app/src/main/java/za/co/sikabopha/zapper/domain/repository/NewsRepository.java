package za.co.sikabopha.zapper.domain.repository;

import java.util.List;

import za.co.sikabopha.zapper.domain.model.News;

public interface NewsRepository {
    List<News> getNews();
}
