package com.devloperloka.alternatesforchinaapps;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView AppIcon;
    ImageView AppIcon2;
    TextView AppTitle1;
    TextView AppTitle2;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.AppIcon=itemView.findViewById(R.id.mImageView);
        this.AppIcon2=itemView.findViewById(R.id.mImageView2);
        this.AppTitle1=itemView.findViewById(R.id.Title1);
        this.AppTitle2=itemView.findViewById(R.id.Title2);
    }
}
