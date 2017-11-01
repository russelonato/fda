package ph.gov.fda.cca.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ph.gov.fda.cca.R;

public class ToolsActivity extends AppCompatActivity {

    private Button btnVerifyProduct;
    private Button btnSubmitFeedback;
    private Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
    }

    private void initialize(){
        btnVerifyProduct = (Button)findViewById(R.id.btn_verifyProduct);
        btnSubmitFeedback = (Button)findViewById(R.id.btn_submitFeedback);
        btnAbout = (Button)findViewById(R.id.btn_about);

        btnVerifyProduct.setOnClickListener(new BtnSearchProductListener(this));
        btnSubmitFeedback.setOnClickListener(new BtnSubmitFeedbackListener(this));
        btnAbout.setOnClickListener(new BtnAboutListener(this));
    }
}

class BtnSearchProductListener implements View.OnClickListener{
    private AppCompatActivity appCompatActivity;

    public BtnSearchProductListener(AppCompatActivity appCompatActivity){
        this.appCompatActivity = appCompatActivity;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(appCompatActivity, SearchProductActivity.class);
    }
}

class BtnSubmitFeedbackListener implements View.OnClickListener{
    private AppCompatActivity appCompatActivity;

    public BtnSubmitFeedbackListener(AppCompatActivity appCompatActivity){
        this.appCompatActivity = appCompatActivity;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(appCompatActivity, SubmitFeedbackActivity.class);
    }
}

class BtnAboutListener implements View.OnClickListener{
    private AppCompatActivity appCompatActivity;

    public BtnAboutListener(AppCompatActivity appCompatActivity){
        this.appCompatActivity = appCompatActivity;
    }

    @Override
    public void onClick(View v) {
        // TODO create class
    }
}

