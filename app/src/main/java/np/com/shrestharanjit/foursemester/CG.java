package np.com.shrestharanjit.foursemester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CG extends AppCompatActivity {

    Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg);

        button1 = (Button) findViewById(R.id.cgunit1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(CG.this, CG1.class);
                startActivity(myIntent);
            }
        });


        button2 = (Button) findViewById(R.id.cgunit2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(CG.this, CG2.class);
                startActivity(myIntent);
            }
        });

        button3 = (Button) findViewById(R.id.cgunit3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(CG.this, CG3.class);
                startActivity(myIntent);
            }
        });

        button4 = (Button) findViewById(R.id.cgunit4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(CG.this, CG4.class);
                startActivity(myIntent);
            }
        });

        button5 = (Button) findViewById(R.id.cgunit5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(CG.this, CG5.class);
                startActivity(myIntent);
            }
        });

    }
}
