package com.barracuda.recipe;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.barracuda.recipe.R.id.foods_listview;

public class FoodsList extends AppCompatActivity {

    public ListView l;
    public String[] foods_data = {"سبزی پلو","خورشت آلو اسفناج", "آش", "کوکو", "کتلت", "کباب", "سوپ", "کته", "نیمرو"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foods_list);

        l = (ListView) findViewById(foods_listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item, R.id.list_item_afood, foods_data);

        l.setAdapter(adapter);
    }

    private class MyAdapter extends ArrayAdapter<String> {
        public MyAdapter(Context context, int resource, int strings) {
            super(context, resource, strings);

        }
    }
}
