package com.example.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.nio.Buffer;

public class SecondFragment extends Fragment {
    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable
                             ViewGroup container, @Nullable Bundle savedInflaet){
        return inflater.inflate(R.layout.secondfragment,container,false);}
}
