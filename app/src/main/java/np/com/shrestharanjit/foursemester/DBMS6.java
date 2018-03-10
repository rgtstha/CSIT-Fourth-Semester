package np.com.shrestharanjit.foursemester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DBMS6 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms6);


        pdfView = (PDFView) findViewById(R.id.dbms6pdf);
        pdfView.fromAsset("dbms6.pdf").load();
    }
}
