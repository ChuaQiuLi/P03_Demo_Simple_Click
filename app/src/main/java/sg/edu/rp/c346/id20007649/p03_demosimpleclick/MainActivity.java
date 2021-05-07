package sg.edu.rp.c346.id20007649.p03_demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById((R.id.editTextInput));
        tbn =findViewById(R.id.toggleButtonEnabled);

        System.out.println("test onCreate");

        //to show what will happen when the user click on to the button
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strRespone = etInput.getText().toString();

                tvDisplay.setText(strRespone);

            }
        });

        tbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tbn.isChecked()){
                    etInput.setEnabled(true);
                }

                else{
                    etInput.setEnabled(false);
                }
            }
        });
    }
}