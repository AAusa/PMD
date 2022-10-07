package com.example.pilaciclovidaintents.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.pilaciclovidaintents.MainActivity;
import com.example.pilaciclovidaintents.databinding.FragmentDashboardBinding;
import com.example.pilaciclovidaintents.ui.home.HomeFragment;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
/*
    public void presionaBoton(View view) {
        Button boton = (Button) view;
        Intent ejemplo = new Intent(this, MainActivity.class);
        startActivity(ejemplo);
    }

    public void presionaBoton2(View view) {
        Button boton = (Button) view;
        Intent ejemplo = new Intent(this, HomeFragment.class);
        startActivity(ejemplo);
    }
*/

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
}