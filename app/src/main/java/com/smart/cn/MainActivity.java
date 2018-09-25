package com.smart.cn;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.shanutec.cn.InputDialog;
import com.shanutec.cn.InputInterface;
import com.shanutec.cn.NomalDialog;
import com.shanutec.cn.QuitDialog;
import com.shanutec.cn.SureDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;
    @BindView(R.id.btn4)
    Button btn4;
    @BindView(R.id.btn5)
    Button btn5;
    @BindView(R.id.btn6)
    Button btn6;
    @BindView(R.id.btn7)
    Button btn7;
    @BindView(R.id.btn8)
    Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5,R.id.btn6, R.id.btn7, R.id.btn8})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                QuitDialog.Builder dialog = new QuitDialog.Builder(this);
                dialog.setTitle("温馨提示")
                        .setCanceledOnTouchOutside(true)
                        .setAnim(true)
                        .setMessage("是否退出登陆?")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .create().show();
                break;
            case R.id.btn2:
                QuitDialog.Builder dialog2 = new QuitDialog.Builder(this);
                dialog2.setTitle("温馨提示")
                        .setTitleTextSize(18f)
                        .setCanceledOnTouchOutside(false)
                        .setTitleTextColor(getResources().getColor(R.color.colorDialogTest))
                        .setMessage("是否退出登陆?")
                        .setMessageTextSize(16f)
                        .setMessageTextColor(getResources().getColor(R.color.colorDialogTest3))
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .setPositiveButtonColor(Color.parseColor("#38ADFF"))
                        .setPositiveButtonSize(14f)
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).setNegativeButtonColor(Color.parseColor("#7D7D7D"))
                        .setNegativeButtonSize(18f)
                        .create().show();

                break;
            case R.id.btn3:
                InputDialog.Builder dialog3 = new InputDialog.Builder(this);
                dialog3.setTitle("温馨提示")
                        .setTitleTextSize(16f)
                        .setCanceledOnTouchOutside(false)
                        .setHint("昵称")
                        .setTitleTextColor(getResources().getColor(R.color.colorDialogTest))
                        .setHintTextSize(14f)
                        .setHintTextColor(getResources().getColor(R.color.colorDialogTest))
                        .setPositiveButton("确定", new InputInterface() {
                            @Override
                            public void onClick(DialogInterface dialog, Context mcongtext, String msg) {
                                Toast.makeText(mcongtext, "弄好 " + msg, Toast.LENGTH_LONG).show();
                                dialog.dismiss();
                            }

                        })
                        .setPositiveButtonColor(Color.parseColor("#38ADFF"))
                        .setPositiveButtonSize(14f)
                        .setNegativeButton("取消", new InputInterface() {

                            @Override
                            public void onClick(DialogInterface dialog, Context mcongtext, String msg) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButtonColor(Color.parseColor("#7D7D7D"))
                        .setNegativeButtonSize(14f)
                        .create().show();


                break;
            case R.id.btn4:
                InputDialog.Builder dialog4 = new InputDialog.Builder(this);
                dialog4.setTitle("温馨提示")
                        .setCanceledOnTouchOutside(false)
                        .setPositiveButton("确定", new InputInterface() {
                            @Override
                            public void onClick(DialogInterface dialog, Context mcongtext, String msg) {
                                Toast.makeText(mcongtext, "弄好 " + msg, Toast.LENGTH_LONG).show();
                                dialog.dismiss();
                            }
                        })
                        .setNegativeButton("取消", new InputInterface() {

                            @Override
                            public void onClick(DialogInterface dialog, Context mcongtext, String msg) {
                                dialog.dismiss();
                            }

                        })
                        .create().show();


                break;
            case R.id.btn5:
                SureDialog.Builder dialog5 = new SureDialog.Builder(this);
                dialog5.setTitle("温馨提示")
                        .setTitleTextSize(18f)
                        .setCanceledOnTouchOutside(false)
                        .setTitleTextColor(Color.parseColor("#38ADFF"))
                        .setMessage("阿里巴巴网络技术有限公司（简称：阿里巴巴集团）是以曾担任英语教师的马云为首的18人于1999年在浙江杭州创立。阿里巴巴集团经营多项业务，另外也从关联公司的业务和服务中取得经营商业生态系统上的支援。业务和关联公司的业务包括：淘宝网、天猫、聚划算、全球速卖通、阿里巴巴国际交易市场、1688、阿里妈妈、阿里云、蚂蚁金服、菜鸟网络等。")
                        .setMessageTextSize(16f)
                        .setMessageTextColor(getResources().getColor(R.color.colorDialogTest3))
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .setPositiveButtonColor(Color.parseColor("#38ADFF"))
                        .setPositiveButtonSize(14f)
                        .create().show();
                break;
            case R.id.btn6:

                NomalDialog.Builder dialog6 = new NomalDialog.Builder(this);
                dialog6.setTitle("温馨提示")
                        .setCanceledOnTouchOutside(true)
                        .setMessage("    加在内容可以可以无限常，弹匣广东省点击发送的看法发动反击拉萨疯狂拉升就发顺丰静安寺附近发的会计师饭卡")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .create().show();
                break;
            case R.id.btn7:



                NomalDialog.Builder dialog7 = new NomalDialog.Builder(this);
                dialog7.setTitle("温馨提示")
                        .setTitleTextSize(18f)
                        .setCanceledOnTouchOutside(false)
                        .setTitleTextColor(getResources().getColor(R.color.colorDialogTest))
                        .setMessage("    加在内容可以可以无限常，弹匣广东省点击发送的看法发动反击拉萨疯狂拉升就发顺丰静安寺附近发的会计师饭卡")
                        .setMessageTextSize(16f)
                        .setMessageTextColor(getResources().getColor(R.color.colorDialogTest3))
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .setPositiveButtonColor(Color.parseColor("#38ADFF"))
                        .setPositiveButtonSize(14f)
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).setNegativeButtonColor(Color.parseColor("#7D7D7D"))
                        .setNegativeButtonSize(18f)
                        .create().show();




                break;
            case R.id.btn8:
                break;
        }
    }
}
