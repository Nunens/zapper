package za.co.sikabopha.zapper.presentation;

import android.database.Observable;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import za.co.sikabopha.zapper.domain.model.News;
import za.co.sikabopha.zapper.domain.repository.NewsRepository;

@HiltViewModel
public class NewsViewModel extends ViewModel {
    @Inject
    NewsRepository repository;

    MutableLiveData<List<News>> newsList = new MutableLiveData<>();

    public LiveData<List<News>> getNews(){
        newsList.setValue(repository.getNews());
        return newsList;
    }
}
