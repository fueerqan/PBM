package id.ac.unsyiah.formsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView npm, nama, jurusan, textnpm, textnama, textjurusan;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasi();
        fungsiClick();
    }

    private void inisialisasi() {
        npm = (TextView) findViewById(R.id.edtNPM);
        nama = (TextView) findViewById(R.id.edtNama);
        jurusan = (TextView) findViewById(R.id.edtJurusan);

        textnpm = (TextView) findViewById(R.id.textnpm);
        textnama = (TextView) findViewById(R.id.textnama);
        textjurusan = (TextView) findViewById(R.id.textjurusan);

        submit = (Button) findViewById(R.id.btnSubmit);
    }

    private void fungsiClick() {
       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               textnpm.setText(npm.getText());
               textnama.setText(nama.getText());
               textjurusan.setText(jurusan.getText());
           }
       });
    }
}
