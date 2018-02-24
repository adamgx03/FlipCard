package com.abooth.flipcard;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class QuestionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Button answerBtn = (Button) findViewById(R.id.button);
        answerBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent showAnswer = new Intent(QuestionActivity.this,AnswerActivity.class);
                startActivity(showAnswer);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.question_out,R.anim.answer_in);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //INFLATE THE MENU
        getMenuInflater().inflate(R.menu.question, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //HANDLE ACTION BAR ITEM CLICKS HERE.  THE ACTION BAR WILL
        //AUTOMATICALLY HANDLE CLICKS ON THE HOME.UP BUTTON, SO LONG
        //AS YOU SPECIFY A PARENT ACTIVITY IN AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
