package com.example.raniabenali_taskmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button) findViewById((R.id.button1));
        Button btn2=(Button) findViewById((R.id.button2));
        btn1.setOnClickListener((View.OnClickListener)this);
        btn2.setOnClickListener((View.OnClickListener)this);
    }
    public void navigateToActivity(Class nextClass){
        Intent intent=new Intent(MainActivity.this,nextClass);
        startActivity(intent);
        finish();
    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.button1: {
                navigateToActivity(Login_Activity.class);
                break;
            }
            case R.id.button2: {
                navigateToActivity(SignUp_Activity.class);
                break;
            }
            default:
                break;
        }

    }
}
