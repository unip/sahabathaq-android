package unipwarehouse.sahabathaq;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class KelasSetoran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_setoran);

        // Title fontface
        TextView txt = (TextView) findViewById(R.id.namaKelas);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/cinzel-bold.ttf");
        txt.setTypeface(font);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


    }

    //Menu options kelas setoran
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.kelas_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
}
