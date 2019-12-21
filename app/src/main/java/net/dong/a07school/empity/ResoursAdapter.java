package net.dong.a07school.empity;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import net.dong.a07school.R;

import java.util.List;

/**
 * @author: Donggy
 * @create: 2019-12-19 22:34
 **/
public class ResoursAdapter extends ArrayAdapter<Resours> {
    private int resourceId;


    public ResoursAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<Resours> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Resours resours = getItem(position);
        View view ;
        ViewHolder viewHolder;
        if (convertView ==null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.resoursImage = (ImageView)view.findViewById(R.id.im_img);
            viewHolder.resoursName = (TextView)view.findViewById(R.id.tx_img);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }


        viewHolder.resoursImage.setImageResource(resours.getImageid());
        viewHolder.resoursName.setText(resours.getName());

        return view;
    }

    private class  ViewHolder{

        TextView  resoursName;
        ImageView resoursImage;

    }
}
