package com.example.bottomsheetfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bottomsheetfragment.fragments.CommentBottomSheetFragment;
import com.example.bottomsheetfragment.fragments.LikeBottomSheetFragment;
import com.example.bottomsheetfragment.fragments.MoreBottomSheetFragment;
import com.example.bottomsheetfragment.fragments.ShareBottomSheetFragment;

public class MainActivity extends AppCompatActivity {

    private ImageView imageComment;
    private ImageView imageLike;
    private ImageView imageShare;
    private ImageView imageMore;

    private CommentBottomSheetFragment commentBottomSheetFragment;
    private LikeBottomSheetFragment likeBottomSheetFragment;
    private MoreBottomSheetFragment moreBottomSheetFragment;
    private ShareBottomSheetFragment shareBottomSheetFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageComment = findViewById(R.id.imgComment);
        imageLike = findViewById(R.id.imgLike);
        imageShare = findViewById(R.id.imgShare);
        imageMore = findViewById(R.id.imgMore);

        commentBottomSheetFragment = new CommentBottomSheetFragment();
        likeBottomSheetFragment = new LikeBottomSheetFragment();
        shareBottomSheetFragment = new ShareBottomSheetFragment();
        moreBottomSheetFragment = new MoreBottomSheetFragment();

        imageComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commentBottomSheetFragment.show(getSupportFragmentManager() , commentBottomSheetFragment.getTag());
            }
        });
        imageLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likeBottomSheetFragment.show(getSupportFragmentManager() , likeBottomSheetFragment.getTag());
            }
        });
        imageMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moreBottomSheetFragment.show(getSupportFragmentManager() , moreBottomSheetFragment.getTag());
            }
        });
        imageShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareBottomSheetFragment.show(getSupportFragmentManager() , shareBottomSheetFragment.getTag());
            }
        });
    }
}