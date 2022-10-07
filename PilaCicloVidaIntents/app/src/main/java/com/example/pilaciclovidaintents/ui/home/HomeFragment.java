package com.example.pilaciclovidaintents.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.pilaciclovidaintents.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i("EJEMPLO", "Estoy en onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("EJEMPLO", "Estoy en onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("EJEMPLO", "Estoy en onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("EJEMPLO", "Estoy en onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("EJEMPLO", "Estoy en onDestroy");
    }
/*
    @Override
    public void onRestart() {
        super.onRestart();
        Log.i("EJEMPLO", "Estoy en onRestart");
    }
 */
}