package demo.fitnanoattendancesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    //button1 is used to login to the first user page

    button1 = (Button) findViewById(R.id.button1);
    button1.setOnClickListener(new View.OnClickListener()
        {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, NewUser.class);
            startActivity(i);

        }
    });

}
}

