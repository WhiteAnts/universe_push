package com.comsince.github;

import java.util.List;

/**
 * @author comsicne
 *         Copyright (c) [2019] [Meizu.inc]
 * @Time 19-2-14 上午11:38
 **/
public interface PushService {

    void pushByIp(String ip, String message);

    /**
     * 单推接口
     * */
    void pushByToken(String token, String message);


    void pushByTokens(List<String> token, String message);

    void pushAll(String message);
}