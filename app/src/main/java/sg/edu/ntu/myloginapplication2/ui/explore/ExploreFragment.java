package sg.edu.ntu.myloginapplication2.ui.explore;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import sg.edu.ntu.myloginapplication2.databinding.FragmentExploreBinding;
import sg.edu.ntu.myloginapplication2.ui.ItemListActivity;

public class ExploreFragment extends Fragment {

    private FragmentExploreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentExploreBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final ImageView exploreImage = binding.ExploreImage;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        ImageView exploreMainImage = binding.ExploreImage;
        exploreMainImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "UK");
                startActivity(intent);
            }
        });

        ImageView GalleriesPicture1 = binding.GalleriesPicture1;
        GalleriesPicture1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "UK");
                startActivity(intent);
            }
        });

        ImageView GalleriesPicture2 = binding.GalleriesPicture2;
        GalleriesPicture2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "Ode");
                startActivity(intent);
            }
        });

        ImageView GalleriesPicture3 = binding.GalleriesPicture3;
        GalleriesPicture3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "Ning");
                startActivity(intent);
            }
        });

        ImageView PopPicture1 = binding.PopPicture1;
        PopPicture1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "wheat");
                startActivity(intent);
            }
        });

        ImageView PopPicture2 = binding.PopPicture2;
        PopPicture2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "old");
                startActivity(intent);
            }
        });

        ImageView PopPicture3 = binding.PopPicture3;
        PopPicture3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "harvest");
                startActivity(intent);
            }
        });

        ImageView ArtistPicture1 = binding.ArtistPicture1;
        ArtistPicture1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "van");
                startActivity(intent);
            }
        });

        ImageView ArtistPicture2 = binding.ArtistPicture2;
        ArtistPicture2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "lim");
                startActivity(intent);
            }
        });

        ImageView ArtistPicture3 = binding.ArtistPicture3;
        ArtistPicture3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "ning");
                startActivity(intent);
            }
        });

        TextView StylesText1 = binding.StylesText1;
        StylesText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "post");
                startActivity(intent);
            }
        });

        TextView StylesText2 = binding.StylesText2;
        StylesText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "expressionist");
                startActivity(intent);
            }
        });

        TextView StylesText3 = binding.StylesText3;
        StylesText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "abstract");
                startActivity(intent);
            }
        });

        TextView LocationText1 = binding.LocationText1;
        LocationText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "europe");
                startActivity(intent);
            }
        });

        TextView LocationText2 = binding.LocationText2;
        LocationText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), ItemListActivity.class);
                intent.putExtra("item", "asia");
                startActivity(intent);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}