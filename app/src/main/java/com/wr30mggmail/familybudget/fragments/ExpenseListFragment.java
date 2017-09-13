package com.wr30mggmail.familybudget.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wr30mggmail.familybudget.ExpenseItem;
import com.wr30mggmail.familybudget.R;
import com.wr30mggmail.familybudget.adapters.ExpenseListAdapter;

import java.util.ArrayList;



public class ExpenseListFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_POSITION = "param1";

    // TODO: Rename and change types of parameters
    private int position;

    public ExpenseItem item;
    public ArrayList<ExpenseItem> expenseItems;
    public ExpenseListAdapter adapter;

    public ExpenseListFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ExpenseListFragment newInstance(int position) {
        ExpenseListFragment fragment = new ExpenseListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = getArguments().getInt(ARG_POSITION);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        item = new ExpenseItem("hello", 15);
        expenseItems = new ArrayList<>();
        expenseItems.add(item);
        View v =  inflater.inflate(R.layout.fragment_expense_list, container, false);

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        adapter = new ExpenseListAdapter(expenseItems);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter  (adapter);

        return v;
    }




    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

}
