package com.balu0694.sp1_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context mContext;

    MyAdapter(List<ListItem> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ListItem listItem = listItems.get(position);

        holder.aHeadText.setText(listItem.getHead());
        holder.aDescText.setText(listItem.getDesc());

        Picasso.get().load(listItem.getImgUrl()).into(holder.aImgView);

        holder.aLinLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "You Clicked Item " + listItem.getHead(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView aHeadText;
        TextView aDescText;
        ImageView aImgView;
        LinearLayout aLinLay;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            aHeadText = itemView.findViewById(R.id.textViewHeading);
            aDescText = itemView.findViewById(R.id.textViewDesc);
            aImgView = itemView.findViewById(R.id.imgView);
            aLinLay = itemView.findViewById(R.id.linearLayout);
        }
    }
}
