package tsou.cn.module_chat.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import tsou.cn.lib_base.utils.RouteUtils;
import tsou.cn.module_chat.R;
@Route(path = RouteUtils.Chat_Interceptor)
public class InterceptorActivity extends AppCompatActivity {

    /**
     * eventBus数据接收页面
     */
    private TextView mTextView;
    private String extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interceptor);
        initData();
        initView();
    }

    private void initData() {
        extra = getIntent().getStringExtra("extra");

    }
    private void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setText("extra==>" + extra);
    }
}
