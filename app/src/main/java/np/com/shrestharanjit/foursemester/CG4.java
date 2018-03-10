package np.com.shrestharanjit.foursemester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CG4 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg4);

        pdfView = (PDFView) findViewById(R.id.cg4pdf);
        pdfView.fromAsset("cg4.pdf").load();
    }
}
