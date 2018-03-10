package np.com.shrestharanjit.foursemester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.notes);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, Notes.class);
                startActivity(myIntent);
            }
        });




        button2 = (Button) findViewById(R.id.syllabus);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, Syllabus.class);
                startActivity(myIntent);
            }
        });


        button3 = (Button) findViewById(R.id.developer);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, About_developer.class);
                startActivity(myIntent);
            }
        });

        button4 = (Button) findViewById(R.id.solutions);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Toast.makeText(getBaseContext(), "Content not available. Wait some days!!" , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
