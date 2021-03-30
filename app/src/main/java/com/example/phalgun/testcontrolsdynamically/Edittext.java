package com.example.phalgun.testcontrolsdynamically;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Edittext extends AppCompatActivity {


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);
        ListView layout = findViewById(R.id.linearMain);

        //Instanciate
        TextView txt_Question = new TextView(this);
        TextView txt_question_content = new TextView(this);
        EditText txt_edittext=new EditText(this);


        //Question textview layout
        RelativeLayout.LayoutParams Question_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
        txt_Question.setLayoutParams(Question_layout);


        // setting  txt_Question above txt_question_content
        Question_layout.addRule(RelativeLayout.ABOVE, txt_question_content.getId());
        Question_layout.addRule(RelativeLayout.CENTER_HORIZONTAL);
        Question_layout.setMargins(0, 20, 0, 20);
        txt_Question.setText("QUESTION??");
        txt_Question.setTextAppearance(this, R.style.TextAppearance_AppCompat_Title);
        txt_Question.setTextColor(Color.RED);


        // Submit Button layout
        Button button_submit = new Button(this); // your button
        RelativeLayout.LayoutParams Submit_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
        button_submit.setLayoutParams(Submit_layout);
        button_submit.setText("SUBMIT");
        button_submit.setBackgroundColor(Color.RED);
        Submit_layout.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        //set id to widgets
        txt_Question.setId(1);
        txt_question_content.setId(2);

        //submit button onclick
        button_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Clicked Button Index :",
                        Toast.LENGTH_LONG).show();

            }
        });


        //question content layout
        RelativeLayout.LayoutParams question_content_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
        txt_question_content.setLayoutParams(question_content_layout);

        //setting  txt_question_content below textview txt_Question
        question_content_layout.addRule(RelativeLayout.BELOW, txt_Question.getId());
        question_content_layout.setMargins(20, 0, 20, 0);
        question_content_layout.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txt_question_content.setText("aiqwufbuiqwfbiubuiqwfnuwqifnuiqwfnqowwqfnoqwfnoquwqwfnuqwofnoqwfunqwfnoiqwfnuqownfuqownfoqwnf??iushfuienfwqaguifqwniyhqbwfgviqjwfniqwbf");
        txt_question_content.setTextAppearance(this, R.style.TextAppearance_AppCompat_Medium);
        txt_question_content.setTextColor(Color.BLACK);

        //Edittext layout
        RelativeLayout.LayoutParams Edittext_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
        txt_edittext.setLayoutParams(Edittext_layout);
        Edittext_layout.addRule(RelativeLayout.BELOW, txt_question_content.getId());
        Edittext_layout.setMargins(20, 100, 20, 0);


        //add all the widgets to the view group
        layout.addView(button_submit, Submit_layout);
        layout.addView(txt_Question, Question_layout);
        layout.addView(txt_question_content, question_content_layout);
        layout.addView(txt_edittext,Edittext_layout);
    }
}