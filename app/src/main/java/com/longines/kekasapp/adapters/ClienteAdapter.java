package com.longines.kekasapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.longines.kekasapp.R;
import com.longines.kekasapp.models.Platillo;

import java.util.List;

public class ClienteAdapter extends RecyclerView.Adapter<ClienteAdapter.ViewHolder> {

    private List<Platillo> clienteList;
    private int layout;

    public ClienteAdapter(List<Platillo> clienteList, int layout) {
        this.clienteList = clienteList;
        this.layout = layout;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(clienteList.get(position));
    }

    @Override
    public int getItemCount() {
        return clienteList == null ? 0 : clienteList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombreCliente;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombreCliente = itemView.findViewById(R.id.txtNombreCliente);
        }

        public void bind(Platillo platillo) {
            txtNombreCliente.setText(platillo.getNombre());
        }
    }
}
