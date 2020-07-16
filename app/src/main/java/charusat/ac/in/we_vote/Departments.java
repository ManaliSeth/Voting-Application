package charusat.ac.in.we_vote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Departments extends AppCompatActivity {

    private Button CE;
    private Button IT;
    private Button EC;
    private Button EE;
    private Button ME;
    private Button CL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        setTitle("CR SELECTION");

        CE = (Button) findViewById(R.id.btnCE);
        IT = (Button) findViewById(R.id.btnIT);
        EC = (Button) findViewById(R.id.btnEC);
        EE = (Button) findViewById(R.id.btnEE);
        ME = (Button) findViewById(R.id.btnME);
        CL = (Button) findViewById(R.id.btnCL);

        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this , CE.class);
                startActivity(intent);
            }
        });
        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this , IT.class);
                startActivity(intent);
            }
        });
        EC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this , EC.class);
                startActivity(intent);
            }
        });
        EE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this , EE.class);
                startActivity(intent);
            }
        });
        ME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this , ME.class);
                startActivity(intent);
            }
        });
        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this , CL.class);
                startActivity(intent);
            }
        });


    }

}
