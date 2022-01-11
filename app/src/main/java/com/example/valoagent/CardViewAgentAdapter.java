package com.example.valoagent;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

public class CardViewAgentAdapter extends RecyclerView.Adapter<CardViewAgentAdapter.CardViewViewHolder>{
   private ArrayList<Agent> listAgent;

    public CardViewAgentAdapter(ArrayList<Agent> listAgent) {
        this.listAgent = listAgent;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_agent, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewAgentAdapter.CardViewViewHolder holder, int position) {
        Agent agent = listAgent.get(position);
        Glide.with(holder.itemView.getContext())
                .load(agent.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgAgent);

        holder.tvNameAgent.setText(agent.getName());
        holder.tvRoleAgent.setText(agent.getRole());
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_IMG, agent.getPhoto());
            intent.putExtra(DetailActivity.EXTRA_NAME, agent.getName());
            intent.putExtra(DetailActivity.EXTRA_ROLE, agent.getRole());
            intent.putExtra(DetailActivity.EXTRA_DETAIL, agent.getDetail());
            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {return listAgent.size();}

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAgent;
        TextView tvNameAgent, tvRoleAgent;
        CardView cardAgent;
        public  CardViewViewHolder(@NonNull View v){
            super(v);
            cardAgent = v.findViewById(R.id.agent_card);
            imgAgent = v.findViewById(R.id.imgAgent);
            tvNameAgent = v.findViewById(R.id.nameAgent);
            tvRoleAgent = v.findViewById(R.id.roleAgent);
        }
    }
}
