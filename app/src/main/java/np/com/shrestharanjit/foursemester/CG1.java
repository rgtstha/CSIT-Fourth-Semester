package np.com.shrestharanjit.foursemester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CG1 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg1);

        pdfView = (PDFView) findViewById(R.id.cg1pdf);
        pdfView.fromAsset("cg1.pdf").load();
    }
}
