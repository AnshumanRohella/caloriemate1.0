package com.myapp.caloriemate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity {


    EditText weight;
    EditText age;
    EditText height_metric;
    EditText height_inches;
    EditText  height_feet;
    Button next;
    Switch system_select ;
    RadioButton male;
    RadioButton female;
    String system = "Metric";
    String gender= "Male";
    String weight_val="";
    String age_val= "";
    String height_val_cm= "";
    String height_val_feet= "";
    String height_val_inches = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height_inches =  (EditText) findViewById(R.id.height_input_inches);
        height_feet =  (EditText) findViewById(R.id.height_input_feet);
        height_metric = (EditText) findViewById(R.id.height_input);
        weight = (EditText) findViewById(R.id.weight_input);
        age  = (EditText) findViewById(R.id.age_input);
        next = (Button) findViewById(R.id.next_button);
        system_select = (Switch) findViewById(R.id.switch1);
        male = (RadioButton) findViewById(R.id.radioButton);
        female= (RadioButton) findViewById(R.id.radioButton2);
        male.toggle();


        height_inches.setVisibility(View.INVISIBLE);
        height_feet.setVisibility(View.INVISIBLE);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(weight.getText().toString().compareTo("") == 0)
                {
                    Toast.makeText(getApplicationContext(),"Please enter weight",Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                    weight_val =  weight.getText().toString();
                if(age.getText().toString().compareTo("") == 0)
                {
                    Toast.makeText(getApplicationContext(),"Please enter age",Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                    age_val =  age.getText().toString();

                if(system.equalsIgnoreCase("Imperial")){

                    if (height_feet.getText().toString().compareTo("") == 0 || height_inches.getText().toString().compareTo("")==0) {
                        Toast.makeText(getApplicationContext(), "Please enter height", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else
                    {
                        height_val_inches =  height_inches.getText().toString();
                        height_val_feet =  height_feet.getText().toString();

                    }
                }else if(system.equalsIgnoreCase("Metric")){

                    if (height_metric.getText().toString().compareTo("") == 0) {
                        Toast.makeText(getApplicationContext(), "Please enter height", Toast.LENGTH_SHORT).show();
                        return;
                    }else
                    {
                        height_val_cm =  height_metric.getText().toString();
                    }

                }


                start_weekly_routine();

            }
        });


        system_select.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Log.d("Switch Text", system_select.getText().toString());
                if(system_select.isChecked())
                {
                    system =  "Imperial";
                    findViewById(R.id.height_input).setVisibility(View.INVISIBLE);
                    findViewById(R.id.height_input_inches).setVisibility(View.VISIBLE);
                    findViewById(R.id.height_input_feet).setVisibility(View.VISIBLE);
                    weight.setHint("Enter Weight (lbs) ");
                    height_inches.setHint("(inches)");
                    height_feet.setHint("Height (ft)");

                }
                else {
                    system = "Metric";
                    findViewById(R.id.height_input).setVisibility(View.VISIBLE);
                    findViewById(R.id.height_input_inches).setVisibility(View.INVISIBLE);
                    findViewById(R.id.height_input_feet).setVisibility(View.INVISIBLE);
                    weight.setHint("Enter Weight (kgs)");
                    height_metric.setHint("Enter Height (cms)");
                }

            }


        });
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.isSelected())
                    gender = "Male";
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender = "Female";
            }
        });

    }

    private void start_weekly_routine(){
        Intent i =  new Intent(this,weeklyroutine.class);

        if(system.equalsIgnoreCase("Imperial")){

            i.putExtra("height_inches",height_inches.getText());
            i.putExtra("height_feet",height_feet.getText());
        }

        i.putExtra("System",system);
        i.putExtra("age",age_val);
        i.putExtra("height_metric", height_val_cm);
        i.putExtra("height_feet",height_val_feet);
        i.putExtra("height_inches",height_val_inches);
        i.putExtra("weight",weight_val);
        i.putExtra("gender",gender);
        try {
            startActivity(i);
        }catch(Exception e){System.exit(0);}
    }
}
