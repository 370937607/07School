package net.dong.a07school.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.RadioGroup;
import android.widget.Toast;

import net.dong.a07school.R;
import net.dong.a07school.fragment.SchoolFragment;
import net.dong.a07school.fragment.StudentFragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup group;
    private SparseArray<Fragment> fragments;
    private Context mContext;
    private View mPopupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //隐藏自带标题栏
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        // 初始化Fragment
        initFragment();
        // 初始化View
        initView();
    }

    private void initView() {
        // 1. 获取RadioGroup对象，设置监听器
        group = findViewById(R.id.btn_group);
        group.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        replaceFragment(fragments.get(checkedId)); // checkedId是RadioButton的id
    }


    private void initFragment() {
        // 1. 将创建的fragment放入集合中
        fragments = new SparseArray<>();
        fragments.put(R.id.btn_school, SchoolFragment.newInstance()); // RadioButton的id
        fragments.put(R.id.btn_student, StudentFragment.newInstance());


        // activity像fragment传递数据
//        Fragment fragment = new FindFragment();
//        Bundle args = new Bundle();
//        args.putString("param1", "activity向fragment传递的数据");
//        fragment.setArguments(args);
//        fragments.put(R.id.btn_find, fragment);

        // 2. 初始化，将页面定位为第1个fragment
        replaceFragment(fragments.get(R.id.btn_school));
    }

    // 功能：对多个fragment进行管理和替换
    private void replaceFragment(Fragment fragment) {
        // 1. 获取FragmentManager对象
        FragmentManager manager = getSupportFragmentManager();
        // 2. 开始FragmentTransaction的事务管理
        FragmentTransaction ft = manager.beginTransaction();
        // 3. 替换为新的Fragment
        ft.replace(R.id.content_layout, fragment); // activity中LinearLayout的id
        // 4. 事务提交
        ft.commit();
    }


//    private void showPopupMenu(){
//        PopupMenu popupMenu = new PopupMenu(this,mPopupMenu);
//        popupMenu.inflate(R.menu.optionoenu);
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
//                switch (menuItem.getItemId()){
//                    case R.id.action_1:
//                        Toast.makeText(mContext,"Option 1",Toast.LENGTH_SHORT).show();
//                        return true;
//                    case R.id.action_2:
//                        Toast.makeText(mContext,"Option 2",Toast.LENGTH_SHORT).show();
//                        return true;
//                    case R.id.action_3:
//                        Toast.makeText(mContext,"Option 3",Toast.LENGTH_SHORT).show();
//                        return true;
//                    default:
//                        //do nothing
//                }
//
//                return false;
//            }
//        });
//        popupMenu.show();
//    }
}
