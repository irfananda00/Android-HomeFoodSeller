package project.irfananda.homefoodseller.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import project.irfananda.homefoodseller.R;
import project.irfananda.homefoodseller.object.Food;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder>  {

    private List<Food> foodList;
    private Context context;

    public OrderAdapter(List<Food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_linear_order, parent, false);

        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.txt_title.setText(food.getName());
        holder.txt_pembeli.setText(food.getBuyer());
        holder.txt_time.setText(food.getTime());
        holder.txt_price.setText("Rp. "+food.getPrice());
        holder.img_poster.setImageResource(food.getImg());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_title, txt_price, txt_pembeli, txt_time;
        public ImageView img_poster;

        public MyViewHolder(View view) {
            super(view);
            txt_title= (TextView) view.findViewById(R.id.txt_title);
            txt_price= (TextView) view.findViewById(R.id.txt_price);
            txt_pembeli= (TextView) view.findViewById(R.id.txt_pembeli);
            txt_time = (TextView) view.findViewById(R.id.txt_time);
            img_poster= (ImageView) view.findViewById(R.id.img_poster);
        }
    }

}
