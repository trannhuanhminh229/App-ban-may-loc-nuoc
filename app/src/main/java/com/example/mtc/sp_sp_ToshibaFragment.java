package com.example.mtc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sp_sp_ToshibaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sp_sp_ToshibaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sp_sp_ToshibaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sp_sp_ToshibaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static sp_sp_ToshibaFragment newInstance(String param1, String param2) {
        sp_sp_ToshibaFragment fragment = new sp_sp_ToshibaFragment();
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

    private RecyclerView rcvSanPhamCategory;
    private SanPhamCategoryAdapter sanPhamCategoryAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sp_sp_toshiba, container, false);

        rcvSanPhamCategory = view.findViewById(R.id.rcv_sanphamcategory_toshiba);
        sanPhamCategoryAdapter = new SanPhamCategoryAdapter(requireContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false);
        rcvSanPhamCategory.setLayoutManager(linearLayoutManager);

        sanPhamCategoryAdapter.setData(getListSanPhamCategory());


        rcvSanPhamCategory.setAdapter(sanPhamCategoryAdapter);




        return view;
    }

    public List<SanPhamCategory> getListSanPhamCategory() {
        List<SanPhamCategory> listSanPhamCategory = new ArrayList<>();
        String content = "Loại máy: Máy lọc nước dạng đứng\n"
                + "Số lõi lọc: 4 lõi\n"
                + "Dung tích bình chứa: 5 lít\n"
                + "Tỷ lệ lọc thải: Lọc 5 thải 5\n"
                + "Công suất tiêu thụ điện trung bình: 0.048 kW/h\n"
                ;
        List<SanPham> listSanPhamToshiba_1 = new ArrayList<>();
    //        listSanPhamToshiba_1.add(new SanPham(0,"Máy lọc nước RO Toshiba GK 116l", "Máy lọc nước RO Toshiba GK 116l 012345", 5140000,"R.drawable.mln_ro_kangaroo_kg116i_10_loi"));
    //        listSanPhamToshiba_1.add(new SanPham(0,"Máy lọc nước RO Toshiba GK 116l", "Máy lọc nước RO Toshiba GK 116l 012345", 5140000,"https://nshopvn.com/wp-content/uploads/2019/03/so-do-ket-noi-cam-bien-am-thanh-ky-037.jpg"));
    //        listSanPhamToshiba_1.add(new SanPham(0,"Máy lọc nước RO Toshiba GK 116l", "Máy lọc nước RO Toshiba GK 116l 012345", 5140000,"https://nshopvn.com/wp-content/uploads/2019/03/so-do-ket-noi-cam-bien-am-thanh-ky-037.jpg"));
    //        listSanPhamToshiba_1.add(new SanPham(0,"Máy lọc nước RO Toshiba GK 116l", "Máy lọc nước RO Toshiba GK 116l 012345", 5140000,"https://nshopvn.com/wp-content/uploads/2019/03/so-do-ket-noi-cam-bien-am-thanh-ky-037.jpg"));
    //        listSanPhamToshiba_1.add(new SanPham(0,"Máy lọc nước RO Toshiba GK 116l", "Máy lọc nước RO Toshiba GK 116l 012345", 5140000,"https://nshopvn.com/wp-content/uploads/2019/03/so-do-ket-noi-cam-bien-am-thanh-ky-037.jpg"));
//        listSanPhamToshiba_1.add(new SanPham(R.drawable.mln_ro_kangaroo_kg116i_10_loi, "Máy lọc nước RO Sunhouse GK 116l 01", content,514000000));
//        listSanPhamToshiba_1.add(new SanPham(R.drawable.mln_ro_kangaroo_kg116i_10_loi, "Máy lọc nước RO Sunhouse GK 116l 01", content,514000000));
//        listSanPhamToshiba_1.add(new SanPham(R.drawable.mln_ro_kangaroo_kg116i_10_loi, "Máy lọc nước RO Sunhouse GK 116l 01", content,514000000));
//        listSanPhamToshiba_1.add(new SanPham(R.drawable.mln_ro_kangaroo_kg116i_10_loi, "Máy lọc nước RO Sunhouse GK 116l 01", content,514000000));

        listSanPhamCategory.add(new SanPhamCategory("Máy lọc nước Toshiba 01",listSanPhamToshiba_1));
//
//



        return listSanPhamCategory;
    }
}