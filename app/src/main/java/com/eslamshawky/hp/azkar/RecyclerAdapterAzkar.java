package com.eslamshawky.hp.azkar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapterAzkar extends Adapter <RecyclerAdapterAzkar.ViewHolder> {
    private ArrayList<Provider> providers = new ArrayList<>();

    public RecyclerAdapterAzkar(ArrayList<Provider> providers) {
        this.providers = providers;
    }

    public RecyclerAdapterAzkar() {
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       Provider provider = providers.get(position);
       holder.textView.setText(provider.getText());
       holder.play.setText(provider.getImagePlay());
       holder.pause.setText(provider.getImagePause());
       holder.zoomOut.setText(provider.getImageZoomOut());
       holder.zoomIn.setText(provider.getImageZoomIn());
    }

    @Override
    public int getItemCount() {
        return providers.size();
    }

   static class ViewHolder extends RecyclerView.ViewHolder{
       TextView textView;
        Button play,pause,zoomOut,zoomIn;
       public ViewHolder(View itemView) {
           super(itemView);
           textView = itemView.findViewById(R.id.text_azkar);
           play = itemView.findViewById(R.id.play);
           pause = itemView.findViewById(R.id.pause);
           zoomOut = itemView.findViewById(R.id.zoom_out);
           zoomIn = itemView.findViewById(R.id.zoom_in);
       }
   }
}
