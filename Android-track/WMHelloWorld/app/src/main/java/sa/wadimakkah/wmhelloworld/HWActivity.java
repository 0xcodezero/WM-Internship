package sa.wadimakkah.wmhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class HWActivity extends AppCompatActivity {

    TextView displayTextView = null;
    EditText userInputView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw);

        displayTextView = (TextView) findViewById(R.id.text_view_name_display);
        userInputView = (EditText) findViewById(R.id.edit_text_name_input);
        displayTextView.setText("Hello, WadiMakkah!");

        userInputView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Do Nothing ...
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() != 0){
                    displayTextView.setText("Hello, " + charSequence.toString() + "!");
                }else{
                    displayTextView.setText("Hello, WadiMakkah!");
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
