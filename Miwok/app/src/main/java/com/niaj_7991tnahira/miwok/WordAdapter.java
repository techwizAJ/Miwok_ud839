package com.niaj_7991tnahira.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by techwiz on 25-02-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
     int mResourceColorid;



    WordAdapter(Activity context, ArrayList<Word> words,int ResourceColorid){
        super(context,0,words);
        mResourceColorid = ResourceColorid;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentword = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentword.getMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentword.getEnglishWord());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if( currentword.hasImage()) {
            iconView.setImageResource(currentword.getImageResource());
            iconView.setVisibility(View.VISIBLE);
        }
        else {
            iconView.setVisibility(View.GONE);
        }
        View text_layout = listItemView.findViewById(R.id.text_layout);
        text_layout.setBackgroundColor(mResourceColorid);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }

}
