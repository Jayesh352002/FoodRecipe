package com.example.foodrecipe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CapAdapter extends ArrayAdapter {
    private final Activity context;
    private final Integer[] imageIDarray;
    private final String[] nameArray;
    private final String[] timeArray;
    private final String[] buttonArray;

    public CapAdapter(Activity context, Integer[] imageIDArrayParam, String[] nameArrayParam, String[] timeArrayParam , String[] btnArrayParam){

        super(context, R.layout.listview_row , nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.timeArray = timeArrayParam;
        this.nameArray = nameArrayParam;
        this.buttonArray = btnArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        TextView nameTextField = (TextView) rowView.findViewById(R.id.txt_one);
        TextView timeTextField = (TextView) rowView.findViewById(R.id.txt_two);
        TextView buttonTextField = (TextView) rowView.findViewById(R.id.txt_three);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);

        nameTextField.setText(nameArray[position]);
        timeTextField.setText(timeArray[position]);
        buttonTextField.setText(buttonArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        buttonTextField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Intent i = new Intent(context,Capsicum1.class);
                    context.startActivity(i);
                }
                if(position==1)
                {
                    Intent i = new Intent(context,Capsicum2.class);
                    context.startActivity(i);
                }
                if(position==2)
                {
                    Intent i = new Intent(context,Capsicum3.class);
                    context.startActivity(i);
                }
                if(position==3)
                {
                    Intent i = new Intent(context,Capsicum4.class);
                    context.startActivity(i);
                }
                if(position==4)
                {
                    Intent i = new Intent(context,Capsicum5.class);
                    context.startActivity(i);
                }
                if(position==5)
                {
                    Intent i = new Intent(context,Capsicum6.class);
                    context.startActivity(i);
                }
                if(position==6)
                {
                    Intent i = new Intent(context,Capsicum7.class);
                    context.startActivity(i);
                }
            }
        });
        return rowView;
    };
}
