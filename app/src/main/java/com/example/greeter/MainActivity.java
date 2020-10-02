package com.example.greeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public TextView show;
    public Button click;
    public EditText enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=(EditText)findViewById(R.id.name_field);
        click=(Button)findViewById(R.id.button);
        show=(TextView)findViewById(R.id.text);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String copy=enter.getText().toString();
                show.setText("Hello, "+copy);
                if (copy.length()==0){
                    show.setText(copy);
                Toast.makeText(MainActivity.this,"EditText is Empty",Toast.LENGTH_LONG).show();
            }}
        });
    }
}