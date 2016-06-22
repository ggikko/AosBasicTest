package ggikko.me.aosbasictest;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.Unbinder;

/**
 * Created by admin on 16. 6. 22..
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
        onCreate();
    }

    @LayoutRes
    protected abstract int getLayoutRes();

    protected abstract void onCreate();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null)unbinder.unbind();
    }
}
