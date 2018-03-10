package np.com.shrestharanjit.foursemester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SAD extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);

        button1 = (Button) findViewById(R.id.unit1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Toast.makeText(getBaseContext(), "Content not available. Wait some days!!" , Toast.LENGTH_SHORT ).show();
            }
        });

        button2 = (Button) findViewById(R.id.unit2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SAD.this, SAD2.class);
                startActivity(myIntent);
            }
        });


        button3 = (Button) findViewById(R.id.unit3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SAD.this, SAD3.class);
                startActivity(myIntent);
            }
        });

        button4 = (Button) findViewById(R.id.unit4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SAD.this, SAD4.class);
                startActivity(myIntent);
            }
        });


        button5 = (Button) findViewById(R.id.unit5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SAD.this, SAD5.class);
                startActivity(myIntent);
            }
        });

        button6 = (Button) findViewById(R.id.unit6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SAD.this, SAD6.class);
                startActivity(myIntent);
            }
        });

        button7 = (Button) findViewById(R.id.unit7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SAD.this, SAD7.class);
                startActivity(myIntent);
            }
        });
    }
}
