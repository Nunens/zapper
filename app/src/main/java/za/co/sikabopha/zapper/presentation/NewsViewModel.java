package za.co.sikabopha.zapper.presentation;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import za.co.sikabopha.zapper.domain.model.News;
import za.co.sikabopha.zapper.domain.repository.NewsRepository;

@HiltViewModel
public class NewsViewModel extends ViewModel {
    @Inject
    NewsRepository repository;

    List<News> newsList = new ArrayList<>();

    public void getNews(){
        newsList.addAll(repository.getNews());
    }
}
