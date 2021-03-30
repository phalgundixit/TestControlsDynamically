package com.example.phalgun.testcontrolsdynamically;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

    public class checkbox extends AppCompatActivity {


        @SuppressLint("ResourceType")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_controls);
            ScrollView scrollView = new ScrollView(this);
            ListView layout = findViewById(R.id.linearMain);


            //Instanciate
            TextView txt_Question= new TextView(this);
            TextView txt_question_content = new TextView(this);
            CheckBox checkBox1= new CheckBox(this);
            CheckBox checkBox2= new CheckBox(this);
            CheckBox checkBox3= new CheckBox(this);
            CheckBox checkBox4= new CheckBox(this);
            CheckBox checkBox5= new CheckBox(this);
            CheckBox checkBox6= new CheckBox(this);
            CheckBox checkBox7= new CheckBox(this);
            CheckBox checkBox8= new CheckBox(this);
            CheckBox checkBox9= new CheckBox(this);


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
            txt_question_content.setId(2);
            checkBox1.setId(3);
            checkBox2.setId(4);
            checkBox3.setId(5);
            checkBox4.setId(6);


            //submit button onclick
            button_submit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(checkbox.this,Dropdown.class);
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

            //checkbox1

            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
            linearLayout.setGravity(Gravity.RIGHT);
            checkBox1.setText("Mundin");

            //checkbox2

            RelativeLayout.LayoutParams Checkbox2_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
            checkBox2.setLayoutParams(Checkbox2_layout);
            Checkbox2_layout.addRule(RelativeLayout.BELOW,checkBox1.getId());
            Checkbox2_layout.setMargins(50,20,0,0);
            Checkbox2_layout.addRule(RelativeLayout.CENTER_VERTICAL);
            checkBox2.setText("Sala");

            //checkbox3

            RelativeLayout.LayoutParams Checkbox3_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
            checkBox3.setLayoutParams(Checkbox3_layout);
            Checkbox3_layout.addRule(RelativeLayout.BELOW,checkBox2.getId());
            Checkbox3_layout.setMargins(50,20,0,0);
            Checkbox3_layout.addRule(RelativeLayout.CENTER_VERTICAL);
            checkBox3.setText("Cup");

            //checkbox4

            RelativeLayout.LayoutParams Checkbox4_layout = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT); // You might want to tweak these to WRAP_CONTENT
            checkBox4.setLayoutParams(Checkbox4_layout);
            Checkbox4_layout.addRule(RelativeLayout.BELOW,checkBox3.getId());
            Checkbox4_layout.setMargins(50,20,0,0);
            Checkbox4_layout.addRule(RelativeLayout.CENTER_VERTICAL);
            checkBox4.setText("Namde!!");

            //add wudgets to view group
            layout.addView(button_submit, Submit_layout);
            layout.addView(txt_Question, Question_layout);
            layout.addView(txt_question_content, question_content_layout);
            linearLayout.addView(checkBox1);
            layout.addView(checkBox2,Checkbox2_layout);
            layout.addView(checkBox3,Checkbox3_layout);
            layout.addView(checkBox4,Checkbox4_layout);
            scrollView.addView(linearLayout);
        }


    }
