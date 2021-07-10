package com.example.idenditycardproblemcontinuation;

import android.widget.ImageView;
import android.widget.TextView;

public class Card {
    private String company;
    private int image;
    private String  age;
    private String profession;

    public Card(String company, int image, String  age, String profession) {
        this.company = company;
        this.image = image;
        this.age = age;
        this.profession = profession;
    }

    public String getCompany() {
        return company;
    }

    public int getImage() {
        return image;
    }

    public String  getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}
