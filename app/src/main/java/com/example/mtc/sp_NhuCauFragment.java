package com.example.mtc;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sp_NhuCauFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sp_NhuCauFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sp_NhuCauFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sp_NhuCauFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static sp_NhuCauFragment newInstance(String param1, String param2) {
        sp_NhuCauFragment fragment = new sp_NhuCauFragment();
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
        View view = inflater.inflate(R.layout.fragment_sp_nhu_cau, container, false);


        view.findViewById(R.id.sp_nc_btnThemNCSP).setOnClickListener(v -> {

            sp_ncLienHeFragment fragment = new sp_ncLienHeFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.setCustomAnimations(
                    android.R.anim.slide_in_left,  // Hiệu ứng khi fragment vào
                    android.R.anim.slide_out_right, // Hiệu ứng khi fragment ra
                    android.R.anim.slide_in_left,  // Hiệu ứng khi quay lại fragment
                    android.R.anim.slide_out_right // Hiệu ứng khi quay lại fragment cũ
            );

            fragmentTransaction.replace(R.id.sp_nc_layout_themnhucau, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        });

        return view;
    }
}