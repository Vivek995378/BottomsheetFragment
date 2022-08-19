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

public class ShareAdapter extends RecyclerView.Adapter<ShareAdapter.ViewHolder>{

    private Context context;
    private ArrayList<BlockedUserData> userLists;

    public ShareAdapter(Context context, ArrayList<BlockedUserData> userLists) {
        this.context = context;
        this.userLists = userLists;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_share_post,
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ShareAdapter.ViewHolder holder, int position) {
        BlockedUserData data = userLists.get(position);

        holder.userProfile.setImageDrawable(data.getProfileImg());
        holder.tvName.setText(data.getName());
    }

    @Override
    public int getItemCount() {
        return userLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private ShapeableImageView userProfile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.username);
            userProfile = itemView.findViewById(R.id.profileImage);
        }
    }

}
