package ph.gov.fda.cca.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ph.gov.fda.cca.R;

public class MainActivity extends AppCompatActivity {

    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initialize(){
        btnEnter = (Button)findViewById(R.id.btn_enter);

        btnEnter.setOnClickListener(new BtnEnterListener(this));
    }
}

class BtnEnterListener implements View.OnClickListener{
    private AppCompatActivity appCompatActivity;

    public BtnEnterListener(AppCompatActivity appCompatActivity){
        this.appCompatActivity = appCompatActivity;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(appCompatActivity, ToolsActivity.class);
    }
}
