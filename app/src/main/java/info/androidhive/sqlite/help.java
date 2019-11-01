package info.androidhive.sqlite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class help extends AppCompatActivity {
    Button bt_rag,bt_soc,bt_tor,bt_peer;
    String peer="https://www.accreditedschoolsonline.org/resources/peer-pressure/";
    String rag="http://antiragging.in/site/Infopack.aspx";
    String soc="https://nobelcoaching.com/emotional-skills/";
    String tor="https://apt.ch/en/what-is-torture-prevention/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        bt_peer=(Button) findViewById(R.id.bt_peer);
        bt_rag=(Button) findViewById(R.id.bt_rag);
        bt_soc=(Button) findViewById(R.id.bt_soc);
        bt_tor=(Button) findViewById(R.id.bt_tor);

        bt_peer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(peer));
                startActivity(i);
            }
        });

        bt_rag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(rag));
                startActivity(i);

            }
        });
        bt_soc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(soc));
                startActivity(i);
            }
        });

        bt_tor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(tor));
                startActivity(i);
            }
        });


    }
}
