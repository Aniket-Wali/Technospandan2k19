package com.example.chmarax.logregform.Cultural;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chmarax.logregform.R;
import com.ramotion.expandingcollection.ECCardContentListItemAdapter;
import com.example.chmarax.logregform.Cultural.Adaptor.Comment;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"SetTextI18n", "InflateParams"})
public class CommentArrayAdapter extends ECCardContentListItemAdapter<Comment> {

    public CommentArrayAdapter(@NonNull Context context, @NonNull List<Comment> objects) {
        super(context, R.layout.list_element, objects);
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        com.example.chmarax.logregform.Cultural.CommentArrayAdapter.ViewHolder viewHolder;
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            rowView = inflater.inflate(R.layout.list_element, null);
            // configure view holder
            viewHolder = new com.example.chmarax.logregform.Cultural.CommentArrayAdapter.ViewHolder();
            //viewHolder.date = (TextView) rowView.findViewById(R.id.firstLineDate);
            viewHolder.line1 = (TextView) rowView.findViewById(R.id.firstLine);
            viewHolder.line2 = (TextView) rowView.findViewById(R.id.secondLine);
            viewHolder.icon = (ImageView) rowView.findViewById(R.id.icon);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (com.example.chmarax.logregform.Cultural.CommentArrayAdapter.ViewHolder) rowView.getTag();
        }

        final Comment objectItem = getItem(position);
        if (objectItem != null) {
            viewHolder.line1.setText(objectItem.getCommentPersonName() + ":");
            viewHolder.line2.setText(objectItem.getCommentText());
            //viewHolder.date.setText(objectItem.getCommentDate());
            viewHolder.icon.setImageResource(objectItem.getCommentPersonPictureRes());
        }

        // Removing item by tap on comment icon
//        viewHolder.icon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CommentArrayAdapter.this.remove(objectItem);
//                CommentArrayAdapter.this.notifyDataSetChanged();
//            }
//        });

        return rowView;
    }

    static class ViewHolder {
        TextView date;
        TextView line1;
        TextView line2;
        ImageView icon;
    }

}
