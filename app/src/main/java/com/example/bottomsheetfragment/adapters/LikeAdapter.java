package com.example.bottomsheetfragment.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomsheetfragment.R;
import com.example.bottomsheetfragment.pojos.BlockedUserData;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;


public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.ViewHolder>{

    private Context context;
    private ArrayList<BlockedUserData> userLists;

    public LikeAdapter(Context context, ArrayList<BlockedUserData> userLists) {
        this.context = context;
        this.userLists = userLists;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_like, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LikeAdapter.ViewHolder holder, int position) {
        BlockedUserData data = userLists.get(position);

        holder.userImage.setImageDrawable(data.getProfileImg());
        holder.name.setText(data.getName());
        holder.userName.setText(data.getUserName());
    }

    @Override
    public int getItemCount() {
        return userLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ShapeableImageView userImage;
        private TextView userName, name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.img_user);
            name = itemView.findViewById(R.id.tv_userName);
            userName = itemView.findViewById(R.id.tv_message);
        }
    }

}
