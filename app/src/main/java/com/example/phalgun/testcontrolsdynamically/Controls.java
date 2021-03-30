package com.example.phalgun.testcontrolsdynamically;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Controls extends AppCompatActivity {


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);
        ListView layout = findViewById(R.id.linearMain);

        //Instanciate
        TextView txt_Question= new TextView(this);
        RadioGroup radio_group = new RadioGroup(this);
        TextView txt_question_content = new TextView(this);



        //Radio group
        radio_group.setOrientation(RadioGroup.VERTICAL);
        RadioButton btn1 = new RadioButton(this);
        //button 1
        btn1.setText("YES");
        radio_group.addView(btn1);
        //button 2
        RadioButton btn2 = new RadioButton(this);
        radio_group.addView(btn2);
        btn2.setText("NO");
        //button 3
        RadioButton btnN = new RadioButton(this);
        radio_group.addView(btnN);
        btnN.setText("NA");



        //Question textview layout
        RelativeLayout.LayoutParams Question_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
        txt_Question.setLayoutParams(Question_layout);


        // setting  txt_Question above txt_question_content
        Question_layout.addRule(RelativeLayout.ABOVE,txt_question_content.getId());
        Question_layout.addRule(RelativeLayout.CENTER_HORIZONTAL);
        Question_layout.setMargins(0,20,0,20);
        txt_Question.setText("QUESTION??");
        txt_Question.setTextAppearance(this,R.style.TextAppearance_AppCompat_Title);
        txt_Question.setTextColor(Color.RED);


       // Submit Button layout
        Button button_submit = new Button(this); // your button
        RelativeLayout.LayoutParams Submit_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
        button_submit.setLayoutParams(Submit_layout);
        button_submit.setText("Next");
        button_submit.setBackgroundColor(Color.RED);
        Submit_layout.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        //set id to widgets
        txt_Question.setId(1);
        radio_group.setId(2);
        txt_question_content.setId(3);

        //submit button onclick
        button_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Controls.this,checkbox.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),
                        "Clicked Button Index :" ,
                        Toast.LENGTH_LONG).show();

            }
        });


        //question content layout
        RelativeLayout.LayoutParams question_content_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
        txt_question_content.setLayoutParams(question_content_layout);

        //setting  txt_question_content below textview txt_Question
        question_content_layout.addRule(RelativeLayout.BELOW,txt_Question.getId());
        question_content_layout.setMargins(20,0,20,0);
        question_content_layout.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txt_question_content.setText("aiqwufbuiqwfbiubuiqwfnuwqifnuiqwfnqowwqfnoqwfnoquwqwfnuqwofnoqwfunqwfnoiqwfnuqownfuqownfoqwnf??iushfuienfwqaguifqwniyhqbwfgviqjwfniqwbf");
        txt_question_content.setTextAppearance(this,R.style.TextAppearance_AppCompat_Medium);
        txt_question_content.setTextColor(Color.BLACK);

        // radio group layout
        RelativeLayout.LayoutParams radiogrp_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
        radio_group.setLayoutParams(radiogrp_layout);
        radiogrp_layout.addRule(RelativeLayout.BELOW,txt_question_content.getId());
        radiogrp_layout.setMargins(30,30,0,0);



        //add all the widgets to the view group
        layout.addView(button_submit, Submit_layout);
        layout.addView(txt_Question, Question_layout);
        layout.addView(radio_group, radiogrp_layout);
        layout.addView(txt_question_content, question_content_layout);

        /*Button myButton = new Button(this);
        myButton.setText("Push Me");

        LinearLayout ll = (LinearLayout)findViewById(R.id.buttonlayout);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.addView(myButton, lp);*/

         // lm = (LinearLayout) findViewById(R.id.linearMain);
      //  RelativeLayout sj=new RelativeLayout(this);
      /*  RelativeLayout sj=(RelativeLayout)findViewById(R.id.linearMain);

        RelativeLayout.LayoutParams paramsa = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // create the layout params that will be used to define how your
        // button will be displayed
       *//* LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);*//*


        //Create four

            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.VERTICAL);

            // Create TextView
            TextView product = new TextView(this);
            product.setText(" Question");
            ll.addView(product);

            // Create TextView
            TextView price = new TextView(this);
            price.setText("  $"+"     ");
            ll.addView(price);
        final Button btn = new Button(this);
        btn.setId(1);
        paramsa.addRule(RelativeLayout.ALIGN_BOTTOM);*/
      //  sj.addView(btn);

      /*  Button btn = new Button(this);
        RelativeLayout.LayoutParams params = new       RelativeLayout.LayoutParams(160, 160);
        params.leftMargin = 5;
        params.bottomMargin = 4;
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btn.setLayoutParams(params);*/








       /* btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               // Log.i("TAG", "index :" + index);

                Toast.makeText(getApplicationContext(),
                        "Clicked Button Index :",
                        Toast.LENGTH_LONG).show();

            }
        });

        sj.addView(btn);
        setContentView(sj);
        btn.setLayoutParams(paramsa);*/
      //  ll.addView(btn);
            // Create Button
          /*  final Button btn = new Button(this);
            // Give button an ID
            btn.setId(1);
            btn.setText("Add To Cart");
            // set the layoutParams on the button
            btn.setLayoutParams(params);
*/
          /*//  final int index = j;
            // Set click listener for button
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Log.i("TAG", "index :" + index);

                    Toast.makeText(getApplicationContext(),
                            "Clicked Button Index :" + index,
                            Toast.LENGTH_LONG).show();

                }
            });
*/
            //Add button to LinearLayout
           // ll.addView(btn);
            //Add button to LinearLayout defined in XML
           // lm.addView(ll);


        }



}
