package tsou.cn.module_chat.module_service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;

import tsou.cn.lib_base.provider.IChatModuleService;
import tsou.cn.lib_base.utils.RouteUtils;
import tsou.cn.module_chat.net.ChatService;

/**
 * Created by Administrator on 2017/12/5 0005.
 */

@Route(path = RouteUtils.Service_Chat)
public class ChatModuleService implements IChatModuleService {

    @Override
    public String getUserName(String userId) {
        return ChatService.getUserName();
    }

    @Override
    public void init(Context context) {

    }
}
