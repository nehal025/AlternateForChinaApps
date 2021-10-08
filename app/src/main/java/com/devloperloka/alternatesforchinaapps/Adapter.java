package com.devloperloka.alternatesforchinaapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<ChinaApps>models;

    public Adapter(Context c, ArrayList<ChinaApps> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.AppTitle1.setText(models.get(position).getAppName());
        holder.AppTitle2.setText(models.get(position).getAlternateAppName());;
        Glide.with(c).load(models.get(position).getAppLogo()).into(holder.AppIcon);
        Glide.with(c).load(models.get(position).getAlternateAppLogo()).into(holder.AppIcon2);

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
