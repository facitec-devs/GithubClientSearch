package py.edu.facitec.github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText loginEditText;
    private Button buscarButton;

    private TextView nameTextView;
    private TextView emailTextView;

    private ImageView avatarImageView;

    private ListView seguidoresListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEditText = (EditText) findViewById(R.id.editTextLogin);
        buscarButton = (Button) findViewById(R.id.buttonBuscar);

        nameTextView = (TextView) findViewById(R.id.textViewName);
        emailTextView = (TextView) findViewById(R.id.textViewEmail);

        avatarImageView = (ImageView) findViewById(R.id.imageViewAvatar);

        seguidoresListView = (ListView) findViewById(R.id.listViewSeguidores);


        buscarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loginEditText.getText().toString().equals("")){
                    loginEditText.setError("Complete el login");
                    return;
                }

                ///Consultar la red

            }
        });

    }
}
