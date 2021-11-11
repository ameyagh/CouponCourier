package edu.illinois.cs465.couponcourier;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CouponFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class CouponFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CouponFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CouponFragment newInstance(String param1, String param2) {
        CouponFragment fragment = new CouponFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public CouponFragment() {
        // Required empty public constructor
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_coupon, container, false);
//    }
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
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_coupon, container, false);
        ImageView couponLogo =(ImageView) root.findViewById(R.id.couponLogo);

        LinearLayout instore_block =(LinearLayout) root.findViewById(R.id.instore_block);
        LinearLayout online_block =(LinearLayout) root.findViewById(R.id.online_block);
        LinearLayout military_block =(LinearLayout) root.findViewById(R.id.military_block);
        LinearLayout stackable_block =(LinearLayout) root.findViewById(R.id.stackable_block);

        TextView brand_text = (TextView) root.findViewById(R.id.brand_text);
        TextView discount_text = (TextView) root.findViewById(R.id.discount_text);
        TextView exp_text = (TextView) root.findViewById(R.id.exp_text);
        brand_text.setText("Nike");
        discount_text.setText("20% Off");
        exp_text.setText("Exp. 12/31/2021");

        instore_block.setVisibility(View.VISIBLE);
        online_block.setVisibility(View.VISIBLE);
        military_block.setVisibility(View.VISIBLE);
        stackable_block.setVisibility(View.VISIBLE);

        int imageResource = getResources().getIdentifier("@drawable/nike_logo", null, getActivity().getPackageName());

        couponLogo.setImageResource(imageResource);
        return root;
    }
}
