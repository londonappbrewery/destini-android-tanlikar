package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button buttonTop;
    Button buttonBot;
    TextView storyTextView;
    TextView topButton;
    TextView botButton;
    int mStoryIndexTop = 1;
    int mStoryIndexBot = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBot = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (TextView) findViewById(R.id.buttonTop);
        botButton = (TextView) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((mStoryIndexTop == 1 && mStoryIndexBot == 1)|| (mStoryIndexTop == 1 && mStoryIndexBot == 2)){
                    storyTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    botButton.setText(R.string.T3_Ans2);
                }else if((mStoryIndexTop == 2 && mStoryIndexBot == 1)|| (mStoryIndexTop == 2 && mStoryIndexBot == 2) ){
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBot.setVisibility(View.GONE);
                }

                mStoryIndexTop = mStoryIndexTop + 1 ;
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndexBot == 1 && mStoryIndexTop == 1){
                    storyTextView.setText(R.string.T2_Story);
                    botButton.setText(R.string.T2_Ans2);
                    topButton.setText(R.string.T2_Ans1);
                }else if(mStoryIndexBot == 2 && mStoryIndexTop == 1){
                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBot.setVisibility(View.GONE);
                }else if(mStoryIndexBot == 2 && mStoryIndexTop == 2){
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBot.setVisibility(View.GONE);
                }

                mStoryIndexBot = mStoryIndexBot + 1;

            }
        });

    }


}
