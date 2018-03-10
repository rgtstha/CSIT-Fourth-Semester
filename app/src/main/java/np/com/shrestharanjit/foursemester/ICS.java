package np.com.shrestharanjit.foursemester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ICS extends AppCompatActivity {

    Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ics);

        button1 = (Button) findViewById(R.id.icsunit1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ICS.this, ICS1.class);
                startActivity(myIntent);
            }
        });

        button2 = (Button) findViewById(R.id.icsunit2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ICS.this, ICS2.class);
                startActivity(myIntent);
            }
        });

        button3 = (Button) findViewById(R.id.icsunit3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ICS.this, ICS3.class);
                startActivity(myIntent);
            }
        });

        button4 = (Button) findViewById(R.id.icsunit4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ICS.this, ICS4.class);
                startActivity(myIntent);
            }
        });
    }
}
