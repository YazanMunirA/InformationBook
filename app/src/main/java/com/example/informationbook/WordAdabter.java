package com.example.informationbook;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WordAdabter extends RecyclerView.Adapter<WordAdabter.CardViewHolder>{
    private  ArrayList<card_list>card_lists;
    //to use the properties of activity
    private Context context;
// to able show the categories  pictures on screen
    public WordAdabter(ArrayList<card_list> card_lists, Context context) {
        this.card_lists = card_lists;
        this.context = context;
    }

    @NonNull
    @Override
    // we will define the card design that we made As the @CardViewHolder Method ,we determine which design will be diplayed in the recycler View .
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //which we can transfer the card design to display on screen via onBindViewHolder object
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_desighn,parent,false);

        return new CardViewHolder(view);
    }

    @Override
//what be done when the design we created"show the data on the screen "
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        //Transfer the data in the array from card List to an object which the getCategory images and categoryName will be transferred to the #model object
         card_list model = card_lists.get(position);
         holder.textViewSplash.setText(model.getCategoryName());
         holder.imageViewSplash.setImageResource(context.getResources().getIdentifier(model.getImageName(),
                 "drawable",context.getPackageName())); // getIdentifier ==> this method will allow us to display the Image in the components using the name from file "drawable and the methode get three parameter 1- the name of image 2- the folder where the image located "
    }

    @Override
    //specify the amount of data to be displayed in recycler view
    public int getItemCount() {
        return card_lists.size();
    }

    // this class represent the card design which we had created
    public  class CardViewHolder extends RecyclerView.ViewHolder {
        //we need to create the components of their Ids in the constructor
        ImageView imageViewSplash;
        TextView textViewSplash;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            //Match the components to their ids
            imageViewSplash= itemView.findViewById(R.id.imageViewSplash);
            textViewSplash=itemView.findViewById(R.id.textViewSplash);

        }
    }
}

