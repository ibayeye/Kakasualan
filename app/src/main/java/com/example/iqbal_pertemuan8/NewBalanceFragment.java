package com.example.iqbal_pertemuan8;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewBalanceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewBalanceFragment extends Fragment {

    Button beli_nbxsi;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NewBalanceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewBalanceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewBalanceFragment newInstance(String param1, String param2) {
        NewBalanceFragment fragment = new NewBalanceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_newbalance, container, false);

        beli_nbxsi = v.findViewById(R.id.btn_beli_nbxsi);

        beli_nbxsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri webPage = Uri.parse("https://www.newbalance.co.nz/pd/stone-island-x-new-balance-574-legacy/U574LGV1-42468.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
                startActivity(intent);
            }
        });

        return v;

    }
}