package ggikko.me.aosbasictest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.test_button) Button test_button;
    @BindView(R.id.test_edit) EditText test_edit;

    @OnClick({R.id.test_button})
    void callOnClick(View view){
        switch (view.getId()){
            case R.id.test_button :
                break;
        }
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate() {
        unbinder = ButterKnife.bind(this);
    }
}
