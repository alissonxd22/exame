package com.example.exame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.ViewHolder> {

    private List<Cachorros> listaCachorros;
    private Context context;

    public MeuAdapter(List<Cachorros> listaCachorros, Context context) {
        this.listaCachorros = listaCachorros;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Cachorros cachorros = listaCachorros.get(position);

        holder.edittextNome.setText(cachorros.getNome());
        holder.edittextRaca.setText(cachorros.getRaca());
        holder.edittextCor.setText(cachorros.getCor());
        holder.edittextSexo.setText(cachorros.getSexo());
    }

    @Override
    public int getItemCount() {
        return listaCachorros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView edittextNome;
        public TextView edittextRaca;
        public TextView edittextCor;
        public TextView edittextSexo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            edittextNome = (TextView) itemView.findViewById(R.id.edittextNome);
            edittextRaca = (TextView) itemView.findViewById(R.id.edittextRaca);
            edittextRaca = (TextView) itemView.findViewById(R.id.edittextCor);
            edittextSexo = (TextView) itemView.findViewById(R.id.edittextSexo);

        }
    }

}
