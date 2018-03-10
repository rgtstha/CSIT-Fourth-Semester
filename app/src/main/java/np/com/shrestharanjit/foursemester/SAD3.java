package np.com.shrestharanjit.foursemester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class SAD3 extends AppCompatActivity {
    
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad3);

        pdfView = (PDFView) findViewById(R.id.sad3pdf);
        pdfView.fromAsset("sad3.pdf").load();
    }
}
