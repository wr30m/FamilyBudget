package com.wr30mggmail.familybudget.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wr30mggmail.familybudget.ExpenseItem;
import com.wr30mggmail.familybudget.R;

import java.util.ArrayList;

/**
 * Created by Kirabot on 11.09.2017.
 */

public class ExpenseListAdapter extends RecyclerView.Adapter<ExpenseListAdapter.ViewHolder> {

    ExpenseItem item;
    ArrayList<ExpenseItem> itemArrayList;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected TextView vCategory;
        protected TextView vDescription;
        protected TextView vPrice;

        public ViewHolder(View v) {
            super(v);
            vCategory = (TextView) v.findViewById(R.id.category);
            vDescription = (TextView) v.findViewById(R.id.description);
            vPrice = (TextView) v.findViewById(R.id.price);
        }
    }

    public ExpenseListAdapter(ArrayList<ExpenseItem> items) {
        itemArrayList = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.recycler_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        item = getItem(position);

        holder.vCategory.setText(item.getCategory());
        holder.vDescription.setText(item.getDescription());
        holder.vPrice.setText(item.getPrice()+"");
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public ExpenseItem getItem(int position) { return itemArrayList.get(position); }
}
