package com.example.bai4;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class USAFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_usa, container, false);

        ProgressBar progressBar = view.findViewById(R.id.progressBar);
        ScrollView content = view.findViewById(R.id.contentLayout);
        TextView tvContent = view.findViewById(R.id.tvContent);
        tvContent.setText(getString(R.string.info_usa));
        progressBar.setVisibility(View.VISIBLE);
        content.setVisibility(View.GONE);

        new Handler().postDelayed(() -> {
            progressBar.setVisibility(View.GONE);
            content.setVisibility(View.VISIBLE);
        }, 1500);

        return view;
    }
}
