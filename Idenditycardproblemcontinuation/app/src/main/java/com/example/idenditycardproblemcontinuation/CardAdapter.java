package com.example.idenditycardproblemcontinuation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {
    private ArrayList<Card> cardList;
    private ItemClickListener itemClickListener;
    public CardAdapter(ArrayList<Card> cardArrayList,ItemClickListener itemClickListener){
        cardList = cardArrayList;
        this.itemClickListener = itemClickListener;
    }
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new CardViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Card card = cardList.get(position);
        holder.setData(card);
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}
