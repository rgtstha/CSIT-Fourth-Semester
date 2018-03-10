package np.com.shrestharanjit.foursemester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Notes extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);


        button2 = (Button) findViewById(R.id.sad);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Notes.this, SAD.class);
                startActivity(myIntent);
            }
        });

        button3 = (Button) findViewById(R.id.toc);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Notes.this, TOC.class);
                startActivity(myIntent);
            }
        });

        button4 = (Button) findViewById(R.id.ics);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Notes.this, ICS.class);
                startActivity(myIntent);
            }
        });

        button5 = (Button) findViewById(R.id.dbms);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Notes.this, DBMS.class);
                startActivity(myIntent);
            }
        });


        button6 = (Button) findViewById(R.id.tw);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Toast.makeText(getBaseContext(), "Content not available. Wait some days!!" , Toast.LENGTH_SHORT ).show();
            }
        });
        button1 = (Button) findViewById(R.id.cg);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Notes.this, CG.class);
                startActivity(myIntent);
            }
        });

    }
}
