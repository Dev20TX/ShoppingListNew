package com.dev20.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView mReplyTextView1;
    private TextView mReplyTextView2;
    public static final int TEXT_REQUEST = 1;
    private static final int RESULT_OK_1 = 1;
    private static final int RESULT_OK_2 = 2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mReplyTextView1 = findViewById(R.id.food_text_1);
        mReplyTextView2 = findViewById(R.id.food_text_2);

    }

    public void launchFoodActivity(View view) {
        Intent intent = new Intent(this, FoodListActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                    if (resultCode == RESULT_OK_1) {
                        String textFoodReply1 = data.getStringExtra(FoodListActivity.EXTRA_REPLY);
                        mReplyTextView1.setText(textFoodReply1);
                        break;
                    }

            case 2:
                    if (resultCode == RESULT_OK_2) {
                        String textFoodReply2 = data.getStringExtra(FoodListActivity.EXTRA_REPLY);
                        mReplyTextView2.setText(textFoodReply2);
                        break;

            }
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}
