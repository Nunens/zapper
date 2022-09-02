package za.co.sikabopha.zapper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import za.co.sikabopha.zapper.databinding.FragmentFirstBinding;
import za.co.sikabopha.zapper.presentation.NewsViewModel;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    NewsViewModel newsViewModel = new ViewModelProvider(this).get(NewsViewModel.class);

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        newsViewModel.getNews().observe(getActivity(), newsList -> {
            //TODO: Implementation
            //binding.newListview.
        });
        //binding.buttonFirst.setOnClickListener(view1 -> NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}