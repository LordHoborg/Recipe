package com.barracuda.recipe;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedState){
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] foodsList = {
                "خورشت سبزی",
                "ماکارونی",
                "عدس پلو",
                "پیتزا",
                "کوکو سبزی",
                "آش رشته",
                "سبزی پلو",
                "سوپ شیر",
                "خورشت هویج",
                "هلیم",
                "عدسی",
                "بیف استراگانف"
        };

        //List<String> todaysFood = new ArrayList<String>(Arrays.asList(foodsList));

        ArrayAdapter<String> mFoodsAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.foods_list, R.id.list_item_textview, foodsList);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_main);
        listView.setAdapter(mFoodsAdapter);

        return rootView;
    }
}
