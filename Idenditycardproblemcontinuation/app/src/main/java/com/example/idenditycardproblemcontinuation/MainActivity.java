package com.example.idenditycardproblemcontinuation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements ItemClickListener{
    private ArrayList<Card> cardList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        buildRecyclerviewData();
        setRecyclerViewAdapter();
    }

    private void setRecyclerViewAdapter() {
        CardAdapter cardAdapter = new CardAdapter(cardList,this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cardAdapter);

    }

    private void buildRecyclerviewData() {
        cardList = new ArrayList<>();
        cardList.add(new Card("Microsoft",R.drawable.bill,"Age : 64","Profession : Business"));
        cardList.add(new Card("Amazon",R.drawable.jezz,"Age : 56","Profession : Business"));
        cardList.add(new Card("Masai School",R.drawable.prateek,"Age : 31","Profession : Business"));
        cardList.add(new Card("chairman of Tata Sons",R.drawable.ratan,"Age : 83","Profession : Business"));
        cardList.add(new Card("WIPRO",R.drawable.azimpremji,"Age : 75","Profession : Business"));
        cardList.add(new Card("Berkshire Hathaway",R.drawable.warren,"Age : 90","Profession : Business"));
        cardList.add(new Card("CEO, Facebook",R.drawable.markzuckerberg,"Age : 37","Profession : Business"));
        cardList.add(new Card("Founder Oracle",R.drawable.larry,"Age : 76","Profession : Business"));
        cardList.add(new Card("Co-founder Google",R.drawable.sergey,"Age : 47","Profession : Business"));
    }

    @Override
    public void onItemClick(int position,Card card) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                         card.getCompany() + "\n"
                                + card.getAge() + "\n"
                                + card.getProfession()
                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        show();
    }
}