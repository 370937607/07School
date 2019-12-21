package net.dong.a07school.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.dong.a07school.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private View view;
    private Button btn_login;
    private EditText et_username,et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        view = findViewById(R.id.back);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(this);



        //隐藏自带标题栏
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }


    //登录账号与密码的匹配监听
    @Override
    public void onClick(View v) {
        if ((et_username.getText().toString()).equals("xiaoxinxin")&&(et_password.getText().toString()).equals("123")){

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(LoginActivity.this, "您输入有误", Toast.LENGTH_SHORT).show();
        }
    }
}
