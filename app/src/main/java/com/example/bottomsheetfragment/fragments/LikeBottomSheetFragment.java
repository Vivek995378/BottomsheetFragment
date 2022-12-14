package com.example.bottomsheetfragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomsheetfragment.R;
import com.example.bottomsheetfragment.adapters.LikeAdapter;
import com.example.bottomsheetfragment.pojos.BlockedUserData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

public class LikeBottomSheetFragment extends BottomSheetDialogFragment {

    RecyclerView recyclerView;

    public LikeBottomSheetFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_like_bottom_sheet, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        ArrayList<BlockedUserData> list = new ArrayList<>();
        list.add(new BlockedUserData("Vivek", "vivek9718" ,this.getResources().getDrawable(R.drawable.pic)));
        list.add(new BlockedUserData("Yashi", "yashi001",this.getResources().getDrawable(R.drawable.picc)));
        list.add(new BlockedUserData("Sahil", "sahil123",this.getResources().getDrawable(R.drawable.piccc)));
        list.add(new BlockedUserData("Rohit", "rohit_0085",this.getResources().getDrawable(R.drawable.picccc)));
        list.add(new BlockedUserData("Raj", "raj8700",this.getResources().getDrawable(R.drawable.piccccc)));
        list.add(new BlockedUserData("Vivek", "vivek9718" ,this.getResources().getDrawable(R.drawable.pic)));
        list.add(new BlockedUserData("Yashi", "yashi001",this.getResources().getDrawable(R.drawable.picc)));
        list.add(new BlockedUserData("Sahil", "sahil123",this.getResources().getDrawable(R.drawable.piccc)));
        list.add(new BlockedUserData("Rohit", "rohit_0085",this.getResources().getDrawable(R.drawable.picccc)));
        list.add(new BlockedUserData("Raj", "raj8700",this.getResources().getDrawable(R.drawable.piccccc)));
        list.add(new BlockedUserData("Raj", "raj8700",this.getResources().getDrawable(R.drawable.piccccc)));
        list.add(new BlockedUserData("Vivek", "vivek9718" ,this.getResources().getDrawable(R.drawable.pic)));
        list.add(new BlockedUserData("Yashi", "yashi001",this.getResources().getDrawable(R.drawable.picc)));
        list.add(new BlockedUserData("Sahil", "sahil123",this.getResources().getDrawable(R.drawable.piccc)));
        list.add(new BlockedUserData("Rohit", "rohit_0085",this.getResources().getDrawable(R.drawable.picccc)));
        list.add(new BlockedUserData("Raj", "raj8700",this.getResources().getDrawable(R.drawable.piccccc)));

        LikeAdapter adapter = new LikeAdapter(getContext() , list);

        recyclerView.setAdapter(adapter);

        return view;
    }
}