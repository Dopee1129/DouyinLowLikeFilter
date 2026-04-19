package io.github.dopee.douyinfilter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 模块说明页面
 *
 * ★ 配置方式已改为：在抖音设置页面内设置，无需在此 App 修改 ★
 *
 * 操作说明：
 *   1. 在 LSPosed 中激活本模块并勾选"抖音"
 *   2. 强制停止抖音后重新打开
 *   3. 打开抖音 -> 我 -> 设置 -> 通用设置
 *   4. 页面底部会出现 "低赞视频过滤" 选项
 *   5. 点击即可设置过滤阈值，立即生效
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setPadding(64, 120, 64, 64);
        tv.setTextSize(15f);
        tv.setLineSpacing(8f, 1f);
        tv.setText(
                "抖音低赞过滤模块\n\n" +
                "✅ 模块配置说明\n\n" +
                "本模块的阈值设置已内置于抖音设置页面，\n" +
                "无需在此 App 内修改。\n\n" +
                "使用方法：\n" +
                "1. 在 LSPosed 中激活本模块并勾选\"抖音\"\n" +
                "2. 强制停止抖音后重新打开\n" +
                "3. 打开抖音 -> 我 -> 设置 -> 通用设置\n" +
                "4. 页面底部会出现 \"低赞视频过滤\" 选项\n" +
                "5. 点击即可弹出设置框，输入最低点赞数\n" +
                "6. 点\"确定\"后立即生效，无需重启抖音\n\n" +
                "默认阈值：1000 赞\n\n" +
                "注意事项：\n" +
                "- 过滤仅作用于推荐页，不影响关注/搜索页\n" +
                "- 配置持久化保存，重启抖音后自动恢复\n" +
                "- 如未看到设置项，请确认模块已激活并重启抖音"
        );
        setContentView(tv);
    }
}
