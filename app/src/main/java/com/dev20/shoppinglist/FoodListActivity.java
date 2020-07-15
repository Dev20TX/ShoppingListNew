package com.dev20.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FoodListActivity extends AppCompatActivity {
    private static final int RESULT_OK_1 = 1;
    private static final int RESULT_OK_2 = 2;
    public static final String EXTRA_REPLY = "com.dev20.shoppinglist.extra.REPLY";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

    }

    public void returnFoodItem1(View view) {
        String replyItem1 = getResources().getString(R.string.cheese_text);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, replyItem1);
        setResult(RESULT_OK_1, replyIntent);
        finish();
    }

    public void returnFoodItem2(View view) {
        String replyItem2 = getResources().getString(R.string.apples_text);
        Intent replyIntent2 = new Intent();
        replyIntent2.putExtra(EXTRA_REPLY, replyItem2);
        setResult(RESULT_OK_2, replyIntent2);
        finish();
    }
}
