package za.co.sikabopha.zapper.presentation.contract;

import java.util.List;

import za.co.sikabopha.zapper.domain.model.News;

public interface NewsContract {
    interface MainView{
        void setNewsList(List<News> newsList);
    }
}
