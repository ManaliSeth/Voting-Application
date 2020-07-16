package charusat.ac.in.we_vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    private EditText UserName;
    private  EditText EmailID;
    private TextView Info;
    private Button Register;
    private TextView SignIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setTitle("Registration");
        UserName  = (EditText)findViewById(R.id.etUserName);
        EmailID    = (EditText)findViewById(R.id.etEmailID);
        Info       = (TextView)findViewById(R.id.tvInfo);
        Register   = (Button)findViewById(R.id.btnRegister);
        SignIn = (TextView) findViewById(R.id.tvSignIn);

        Register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                validate(UserName.getText().toString(),EmailID.getText().toString());
            }
        });
        SignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registration.this , Login.class));
            }

        });


    }
    private void validate(String UserName , String EmailID )
    {
        if((UserName.equals("Sheena Nilesh Shah"))  && (EmailID.equals("sheenashah132@gmail.com")))
        {
            Toast.makeText(Registration.this,"Registered Successfully",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Registration.this , Departments.class);
            startActivity(intent);

        }
        else
        {
            Register.setEnabled(false);
        }

    }
}
