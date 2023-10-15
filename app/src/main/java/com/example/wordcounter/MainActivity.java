package com.example.wordcounter;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Spinner spinner = (Spinner) findViewById(R.id.spCountOption);
// Create an ArrayAdapter using the string array and a default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.selection_options,
                android.R.layout.simple_spinner_item
        );
// Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner.
        spinner.setAdapter(adapter);

    }

    public void btnCountClick(View view) {
        EditText text = this.findViewById(R.id.edUserInput);
        String userInput = text.getText().toString();
        Log.i("UserText",userInput);

        int count=0;
        Spinner spin = this.findViewById(R.id.spCountOption);
        if(spin.getSelectedItem().equals("Chars")){
            count=WordCounter.getChars(userInput);
        } else {
            count=WordCounter.getWords(userInput);
        }

        Log.i("UserTextCount",String.valueOf(count));

        TextView result = this.findViewById(R.id.tvResult);
        result.setText(String.valueOf(count));
    }
}