package com.example.bottomsheetfragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomsheetfragment.R;
import com.example.bottomsheetfragment.adapters.ShareAdapter;
import com.example.bottomsheetfragment.pojos.BlockedUserData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

public class ShareBottomSheetFragment extends BottomSheetDialogFragment {

    RecyclerView recyclerView;

    public ShareBottomSheetFragment() {
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
        View view =  inflater.inflate(R.layout.fragment_share_bottom_sheet, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        ArrayList<BlockedUserData> list = new ArrayList<>();
        list.add(new BlockedUserData("Vivek", "" ,this.getResources().getDrawable(R.drawable.pic)));
        list.add(new BlockedUserData("Yashi", "",this.getResources().getDrawable(R.drawable.picc)));
        list.add(new BlockedUserData("Sahil", "",this.getResources().getDrawable(R.drawable.piccc)));
        list.add(new BlockedUserData("Rohit", "",this.getResources().getDrawable(R.drawable.picccc)));
        list.add(new BlockedUserData("Raj", "",this.getResources().getDrawable(R.drawable.piccccc)));
        list.add(new BlockedUserData("Vivek", "" ,this.getResources().getDrawable(R.drawable.pic)));
        list.add(new BlockedUserData("Yashi", "",this.getResources().getDrawable(R.drawable.picc)));
        list.add(new BlockedUserData("Sahil", "",this.getResources().getDrawable(R.drawable.piccc)));
        list.add(new BlockedUserData("Rohit", "",this.getResources().getDrawable(R.drawable.picccc)));
        list.add(new BlockedUserData("Raj", "",this.getResources().getDrawable(R.drawable.piccccc)));
        list.add(new BlockedUserData("Vivek", "" ,this.getResources().getDrawable(R.drawable.pic)));
        list.add(new BlockedUserData("Yashi", "",this.getResources().getDrawable(R.drawable.picc)));
        list.add(new BlockedUserData("Sahil", "",this.getResources().getDrawable(R.drawable.piccc)));
        list.add(new BlockedUserData("Rohit", "",this.getResources().getDrawable(R.drawable.picccc)));
        list.add(new BlockedUserData("Raj", "",this.getResources().getDrawable(R.drawable.piccccc)));
        list.add(new BlockedUserData("Vivek", "" ,this.getResources().getDrawable(R.drawable.pic)));
        list.add(new BlockedUserData("Yashi", "",this.getResources().getDrawable(R.drawable.picc)));
        list.add(new BlockedUserData("Sahil", "",this.getResources().getDrawable(R.drawable.piccc)));
        list.add(new BlockedUserData("Rohit", "",this.getResources().getDrawable(R.drawable.picccc)));
        list.add(new BlockedUserData("Raj", "",this.getResources().getDrawable(R.drawable.piccccc)));

        ShareAdapter adapter = new ShareAdapter(getContext() , list);

        recyclerView.setAdapter(adapter);

        return view;
    }
}