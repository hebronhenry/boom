package com.example.hebron.boom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by HEBRON on 9/29/2016.
 */
public class CustomAdapter extends BaseAdapter {



    String []details;
    Context myContext;
    LayoutInflater inflater;


    public CustomAdapter(String []sample, Context context) {
        details = sample;
        myContext = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return details.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public RelativeLayout getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout obj= (RelativeLayout) inflater.inflate(R.layout.details_activity,null);
        ImageView image= (ImageView) obj.findViewById(R.id.image);
        TextView name= (TextView) obj.findViewById(R.id.name);
        TextView date = (TextView) obj.findViewById(R.id.date);
        TextView time= (TextView) obj.findViewById(R.id.time);
        TextView content= (TextView) obj.findViewById(R.id.content);

        String array=details[i];
        String []array1=array.split(",");
        name.setText(array1[0]);
        content.setText(array1[1]);
        time.setText(array1[2]);
        date.setText(array1[3]);

        if(array1[0].equals("Shemeji"))
        {
            image.setImageResource(R.drawable.ic_menu_share);
        }
        if(array1[0].equals("Daudi"))
        {
            image.setImageResource(R.drawable.ic_menu_camera);
        }
        if(array1[0].equals("Fredy"))
        {
            image.setImageResource(R.drawable.ic_menu_manage);
        }




        return obj;
    }



}
