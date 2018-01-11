package unipwarehouse.sahabathaq;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Title fontface
        TextView txt = (TextView) findViewById(R.id.loginTitle);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/cinzel-bold.ttf");
        txt.setTypeface(font);

        // Button action
        TextView crAccount = (TextView) findViewById(R.id.createAccount);
        crAccount.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void sendMessage(View view) {
        Intent i = new Intent(Login.this, KelasSetoran.class);
        startActivity(i);
    }
}
