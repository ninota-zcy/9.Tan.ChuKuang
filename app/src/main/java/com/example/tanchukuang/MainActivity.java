package com.example.tanchukuang;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onButtonClick(View view){
        AlertDialog.Builder builder = 
                new AlertDialog.Builder(this);

        final View viewDialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.tanchukuang, null, false);
        builder.setTitle("登录对话框")
                .setView(viewDialog)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText edituserID = viewDialog.findViewById(R.id.userId);
                        EditText edituserPASSWORD = viewDialog.findViewById(R.id.password);
                        if(edituserID.getText().toString().equals("abc") && edituserPASSWORD.getText().toString().equals("123"))
                            Toast.makeText(MainActivity.this,"登陆成功", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"登陆失败", Toast.LENGTH_LONG).show();
                    }
                });
        builder.create().show();
    }
}