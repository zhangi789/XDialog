package com.shanutec.cn;

import android.content.Context;
import android.content.DialogInterface;

/**
 * @author 张海洋
 * @Date on 2018/09/25.
 * @org 上海..科技有限公司
 * @describe
 */
public interface InputInterface {
    /**
     * @param mDialog
     * @param mContext
     * @param msg
     */
    void onClick(DialogInterface mDialog, Context mContext, String msg);
}
