package np.com.shrestharanjit.foursemester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SAD2 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad2);

        pdfView = (PDFView) findViewById(R.id.sad2pdf);
        pdfView.fromAsset("sad2.pdf").load();
    }
}
