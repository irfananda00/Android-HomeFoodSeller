package project.irfananda.homefoodseller.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import project.irfananda.homefoodseller.R;
import project.irfananda.homefoodseller.object.RequestFood;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.MyViewHolder>  {

    private List<RequestFood> foodList;
    private Context context;

    public RequestAdapter(List<RequestFood> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_card_request, parent, false);

        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RequestFood food = foodList.get(position);
        holder.txt_title.setText(food.getTitle());
        holder.txt_text.setText(food.getText());
        holder.txt_time.setText(food.getTime());
        holder.txt_username.setText(food.getUsername());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_title, txt_text, txt_username, txt_time;
        public ImageView img_content;
        public CardView cv;

        public MyViewHolder(View view) {
            super(view);
            cv = (CardView) view.findViewById(R.id.cv);
            txt_title= (TextView) view.findViewById(R.id.txt_title);
            txt_text= (TextView) view.findViewById(R.id.txt_text);
            txt_username= (TextView) view.findViewById(R.id.txt_username);
            txt_time= (TextView) view.findViewById(R.id.txt_time);
            img_content= (ImageView) view.findViewById(R.id.img_content);
        }
    }

}
