package com.shanutec.cn;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


import android.view.ViewGroup.LayoutParams;

/**
 * @author 张海洋
 * @Date on 2018/09/20.
 * @org 上海..科技有限公司
 * @describe 组成部分   title massge  2个button
 * <p>
 * 支持 修改字体大小，字体颜色，修改内容等
 */
public class QuitDialog extends Dialog {

    public QuitDialog(Context context) {
        super(context);
    }

    public QuitDialog(Context context, int theme) {
        super(context, theme);
    }

    public static class Builder {
        private Context context;

        private String title;
        private int titleColor = Color.parseColor("#38ADFF");
        private float titleSize = 18f;

        private String message;
        private int messageColor = Color.parseColor("#757575");
        private float messageSize = 16f;

        private String positiveButtonText;
        private int positiveButtonTextColor = Color.parseColor("#38ADFF");
        private float positiveButtonTextSize = 14f;

        private String negativeButtonText;
        private int negativeButtonTextColor = Color.parseColor("#7D7D7D");
        private float negativeButtonTextSize = 14f;

        private View contentView;
        private OnClickListener positiveButtonClickListener;
        private OnClickListener negativeButtonClickListener;
        private boolean TouchOutside;
        private boolean isAnim;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        /**
         * 是否允许点击外侧删除
         *
         * @param TouchOutside
         * @return
         */
        public Builder setCanceledOnTouchOutside(boolean TouchOutside) {
            this.TouchOutside = TouchOutside;

            return this;
        }


        /**
         *
         * 设置动画
         * @param TouchOutside
         * @return
         */
        public Builder setAnim(boolean TouchOutside) {
            this.isAnim = isAnim;

            return this;
        }


        /**
         * Set the Dialog setTitleColor from resource
         *
         * @param titleColor
         * @return
         */
        public Builder setTitleTextColor(int titleColor) {
            this.titleColor = titleColor;
            return this;
        }


        /**
         * Set the Dialog setTitleSize from resource
         *
         * @param titleSize
         * @return
         */
        public Builder setTitleTextSize(float titleSize) {
            this.titleSize = titleSize;
            return this;
        }


        /**
         * Set the Dialog setMessageTextSize from resource
         *
         * @param messageSize
         * @return
         */
        public Builder setMessageTextSize(float messageSize) {
            this.messageSize = messageSize;
            return this;
        }


        /**
         * Set the Dialog setMessageTextColor from resource
         *
         * @param messageColor
         * @return
         */
        public Builder setMessageTextColor(int messageColor) {
            this.messageColor = messageColor;
            return this;
        }

        /**
         * Set the Dialog message from resource
         *
         * @param message
         * @return
         */
        public Builder setMessage(int message) {
            this.message = (String) context.getText(message);
            return this;
        }

        /**
         * Set the Dialog title from resource
         *
         * @param title
         * @return
         */
        public Builder setTitle(int title) {
            this.title = (String) context.getText(title);
            return this;
        }

        /**
         * Set the Dialog title from String
         *
         * @param title
         * @return
         */

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContentView(View v) {
            this.contentView = v;
            return this;
        }

        /**
         * Set the positive button resource and it's listener
         *
         * @param positiveButtonText
         * @return
         */
        public Builder setPositiveButton(int positiveButtonText,
                                         OnClickListener listener) {
            this.positiveButtonText = (String) context
                    .getText(positiveButtonText);
            this.positiveButtonClickListener = listener;
            return this;
        }

        public Builder setPositiveButton(String positiveButtonText,
                                         OnClickListener listener) {
            this.positiveButtonText = positiveButtonText;
            this.positiveButtonClickListener = listener;
            return this;
        }


        public Builder setPositiveButtonColor(int positiveButtonTextColor) {

            this.positiveButtonTextColor = positiveButtonTextColor;
            return this;
        }

        public Builder setPositiveButtonSize(float positiveButtonTextSize) {
            this.positiveButtonTextSize = positiveButtonTextSize;
            return this;
        }

        public Builder setNegativeButtonColor(int negativeButtonTextColor) {

            this.negativeButtonTextColor = negativeButtonTextColor;
            return this;
        }

        public Builder setNegativeButtonSize(float negativeButtonTextSize) {
            this.negativeButtonTextSize = negativeButtonTextSize;
            return this;
        }


        public Builder setNegativeButton(int negativeButtonText,
                                         OnClickListener listener) {
            this.negativeButtonText = (String) context
                    .getText(negativeButtonText);
            this.negativeButtonClickListener = listener;
            return this;
        }

        public Builder setNegativeButton(String negativeButtonText,
                                         OnClickListener listener) {
            this.negativeButtonText = negativeButtonText;
            this.negativeButtonClickListener = listener;
            return this;
        }

        public QuitDialog create() {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // instantiate the dialog with the custom Theme
            final QuitDialog dialog = new QuitDialog(context, R.style.NomalDialog);
            dialog.setCanceledOnTouchOutside(TouchOutside);
            View layout = inflater.inflate(R.layout.lt_nomal_quit, null);
            dialog.addContentView(layout, new LayoutParams(
                    LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
            // set the dialog title

            if (isAnim) {
                Window window = dialog.getWindow();
                window.setGravity(Gravity.TOP);
                window.setWindowAnimations(R.style.pop_anim_style);  //添加动画
            }
            //此处可以设置dialog显示的位置 window.setWindowAnimations(R.style.mystyle); //添加动


            TextView mTilte = ((TextView) layout.findViewById(R.id.title));
            mTilte.setText(title);
            mTilte.setTextColor(titleColor);
            mTilte.setTextSize(titleSize);
            // set the confirm button
            if (positiveButtonText != null) {
                Button mSure = ((Button) layout.findViewById(R.id.positiveButton));
                mSure.setText(positiveButtonText);
                mSure.setTextColor(positiveButtonTextColor);
                mSure.setTextSize(positiveButtonTextSize);
                if (positiveButtonClickListener != null) {
                    ((Button) layout.findViewById(R.id.positiveButton))
                            .setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    positiveButtonClickListener.onClick(dialog,
                                            DialogInterface.BUTTON_POSITIVE);
                                }
                            });
                }
            } else {
                // if no confirm button just set the visibility to GONE
                layout.findViewById(R.id.positiveButton).setVisibility(
                        View.GONE);
            }
            // set the cancel button
            if (negativeButtonText != null) {
                Button mCancle = ((Button) layout.findViewById(R.id.negativeButton));
                mCancle.setText(negativeButtonText);
                mCancle.setTextColor(negativeButtonTextColor);
                mCancle.setTextSize(negativeButtonTextSize);
                if (negativeButtonClickListener != null) {
                    ((Button) layout.findViewById(R.id.negativeButton))
                            .setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    negativeButtonClickListener.onClick(dialog,
                                            DialogInterface.BUTTON_NEGATIVE);
                                }
                            });
                }
            } else {
                // if no confirm button just set the visibility to GONE
                layout.findViewById(R.id.negativeButton).setVisibility(
                        View.GONE);
            }
            // set the content message
            if (message != null) {
                TextView mMessage = ((TextView) layout.findViewById(R.id.message));
                mMessage.setText(message);
                mMessage.setTextColor(messageColor);
                mMessage.setTextSize(messageSize);
            } else if (contentView != null) {
            }
            dialog.setContentView(layout);
            return dialog;
        }

    }

}
