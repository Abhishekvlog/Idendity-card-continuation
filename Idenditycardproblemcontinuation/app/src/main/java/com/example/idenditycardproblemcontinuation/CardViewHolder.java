package com.example.idenditycardproblemcontinuation;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.concurrent.TimeoutException;

public class CardViewHolder extends RecyclerView.ViewHolder {
    private TextView Company;
    private ImageView Image;
    private  TextView Age;
    private TextView Profession;
    private ItemClickListener itemClickListener;
    private RelativeLayout relativeLayout;

    public CardViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        Company = itemView.findViewById(R.id.tvCompany);
        Image = itemView.findViewById(R.id.tvimage);
        Age = itemView.findViewById(R.id.tvage);
        Profession = itemView.findViewById(R.id.tvprofession);
        relativeLayout = itemView.findViewById(R.id.relativelayout);

    }
    public void setData(Card card){
        Company.setText(card.getCompany());
        Image.setImageResource(card.getImage());
        Age.setText(card.getAge());
        Profession.setText(card.getProfession());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(getAdapterPosition(),card);
            }
        });
    }
}
