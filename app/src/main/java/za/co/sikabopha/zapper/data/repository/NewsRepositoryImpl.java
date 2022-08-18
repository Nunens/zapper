package za.co.sikabopha.zapper.data.repository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import za.co.sikabopha.zapper.data.dto.NewsDTO;
import za.co.sikabopha.zapper.data.source.NewsApi;
import za.co.sikabopha.zapper.domain.model.News;
import za.co.sikabopha.zapper.domain.repository.NewsRepository;

public class NewsRepositoryImpl implements NewsRepository {
    private NewsApi api;
    public NewsRepositoryImpl(NewsApi api){
        this.api = api;
    }

    @Override
    public List<News> getNews() {
        List<News> resp = new ArrayList<>();
        for(NewsDTO dto : api.getNews()){
            resp.add(new News(dto));
        }
        return resp;
    }
}
