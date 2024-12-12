package sg.edu.ntu.myloginapplication2.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import sg.edu.ntu.myloginapplication2.R;
import sg.edu.ntu.myloginapplication2.ui.MainActivity;
import sg.edu.ntu.myloginapplication2.ui.PurchaseActivity;
import sg.edu.ntu.myloginapplication2.ui.Tab_Navigation_Activity;

public class ListAdapter extends BaseAdapter {
    private List<Integer> imageResourceList;
    private List<Integer> audioResourceList;
    private List<String> nameList;
    private List<String> priceList;
    private boolean canBuy = true;

    private List<MediaPlayer> mediaPlayerList;
    private Context context;

    public ListAdapter(Context context, List<String> nameList, List<String> priceList, List<Integer> imageResourceList, List<Integer> audioResourceList, boolean canBuy) {
        this.context = context;
        this.nameList = nameList;
        this.priceList = priceList;
        this.imageResourceList = imageResourceList;
        this.audioResourceList = audioResourceList;
        this.mediaPlayerList = new ArrayList<>(audioResourceList.size());
        this.canBuy = canBuy;
    }

    @Override
    public int getCount() {
        return imageResourceList.size();
    }

    @Override
    public Object getItem(int position) {
        return imageResourceList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_layout, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textNameView.setText(this.nameList.get(position));
        if (this.canBuy) {
            viewHolder.textPriceView.setText(this.priceList.get(position));
        }
        viewHolder.imageView.setImageResource(this.imageResourceList.get(position));
        int audioResource = this.audioResourceList.get(position);
        mediaPlayerList.add(position, MediaPlayer.create(this.context, audioResource));
        viewHolder.buttonPlayView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = mediaPlayerList.get(position);
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                } else {
                    mediaPlayer.start();
                }
            }
        });
        viewHolder.buttonBuyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(context, PurchaseActivity.class);
                context.startActivity(intent);

            }
        });
        if (!this.canBuy) {
            viewHolder.textPriceView.setVisibility(View.INVISIBLE);
            viewHolder.buttonBuyView.setVisibility(View.INVISIBLE);
            viewHolder.buttonBuyView.setClickable(false);
        }
        return convertView;
    }

    public class ViewHolder {
        ImageView imageView;
        View buttonPlayView;
        View buttonBuyView;

        TextView textNameView;
        TextView textPriceView;

        public ViewHolder(View itemView) {
            imageView = itemView.findViewById(R.id.list_item_img);
            buttonPlayView = itemView.findViewById(R.id.list_button_play);
            buttonBuyView = itemView.findViewById(R.id.list_button_buy);
            textNameView = itemView.findViewById(R.id.list_item_name);
            textPriceView = itemView.findViewById(R.id.list_item_price);
            buttonPlayView.setClickable(true);
            buttonPlayView.setFocusable(true);
        }
    }
}