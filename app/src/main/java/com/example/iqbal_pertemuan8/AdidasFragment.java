package com.example.iqbal_pertemuan8;

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
 * Use the {@link AdidasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdidasFragment extends Fragment {

    Button beli_samba;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AdidasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AdidasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AdidasFragment newInstance(String param1, String param2) {
        AdidasFragment fragment = new AdidasFragment();
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
        View v = inflater.inflate(R.layout.fragment_adidas, container, false);

        beli_samba = v.findViewById(R.id.btn_beli_samba);

        beli_samba.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Uri webPage = Uri.parse("https://www.adidas.com/us/samba");
                Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
                startActivity(intent);
            }
        });

        return v;
    }
}