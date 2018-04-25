package tw.edu.ntut.csie.app01_105590017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mScore;
    private Button mTrans;
    private TextView mGraade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScore = (EditText) findViewById(R.id.edtScore);
        mTrans = (Button) findViewById(R.id.btnTrans);
        mGraade = (TextView) findViewById(R.id.txtGrade);

        mTrans.setOnClickListener(mTransOnClick);
    }

    private View.OnClickListener mTransOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Method method = new Method();
            mGraade.setText(
                    method.letterGrade(Integer.parseInt(mScore.getText().toString()))
            );
        }
    };
}
