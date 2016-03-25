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
import project.irfananda.homefoodseller.adapter.RequestAdapter;
import project.irfananda.homefoodseller.object.DefineListFood;
import project.irfananda.homefoodseller.object.DefineListRequest;
import project.irfananda.homefoodseller.object.Food;
import project.irfananda.homefoodseller.object.RequestFood;
import project.irfananda.homefoodseller.recyclerView.DividerItemDecoration;
import project.irfananda.homefoodseller.recyclerView.RecyclerTouchListener;

public class RequestFragment extends Fragment {

    private List<RequestFood> foodList;
    private RecyclerView rv;
    private RequestAdapter requestAdapter;

    public RequestFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DefineListRequest defineListRequest = new DefineListRequest();
        foodList = defineListRequest.getRequest();
        requestAdapter = new RequestAdapter(foodList,getActivity());
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

//        rv.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        rv.setItemAnimator(new DefaultItemAnimator());

        rv.setAdapter(requestAdapter);

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
