package np.com.shrestharanjit.foursemester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DBMS extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);

        button1 = (Button) findViewById(R.id.dbmsunit1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DBMS.this, DBMS1.class);
                startActivity(myIntent);
            }
        });

        button2 = (Button) findViewById(R.id.dbmsunit2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DBMS.this, DBMS2.class);
                startActivity(myIntent);
            }
        });

        button3 = (Button) findViewById(R.id.dbmsunit3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DBMS.this, DBMS3.class);
                startActivity(myIntent);
            }
        });

        button4 = (Button) findViewById(R.id.dbmsunit4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DBMS.this, DBMS4.class);
                startActivity(myIntent);
            }
        });

        button5 = (Button) findViewById(R.id.dbmsunit5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DBMS.this, DBMS5.class);
                startActivity(myIntent);
            }
        });

        button6 = (Button) findViewById(R.id.dbmsunit6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DBMS.this, DBMS6.class);
                startActivity(myIntent);
            }
        });
    }
}
