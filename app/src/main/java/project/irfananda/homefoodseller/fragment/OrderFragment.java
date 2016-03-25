package project.irfananda.homefoodseller.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import project.irfananda.homefoodseller.ClickListener;
import project.irfananda.homefoodseller.R;
import project.irfananda.homefoodseller.adapter.OrderAdapter;
import project.irfananda.homefoodseller.object.DefineListFood;
import project.irfananda.homefoodseller.object.Food;
import project.irfananda.homefoodseller.recyclerView.DividerItemDecoration;
import project.irfananda.homefoodseller.recyclerView.RecyclerTouchListener;

public class OrderFragment extends Fragment {

    private List<Food> foodList;
    private RecyclerView rv;
    private OrderAdapter orderAdapter;

    public OrderFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DefineListFood defineListFood = new DefineListFood();
        foodList = defineListFood.getFoodDiscover();
        orderAdapter = new OrderAdapter(foodList,getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        rv = (RecyclerView) v.findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(mLayoutManager);

        rv.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        rv.setItemAnimator(new DefaultItemAnimator());

        rv.setAdapter(orderAdapter);

        rv.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), rv, new ClickListener() {
            @Override
            public void onClick(View view, int position) {

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        return v;
    }
}
