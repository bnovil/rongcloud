package io.rong;

import io.rong.messages.VoiceMessage;
import io.rong.models.CodeSuccessResult;

import java.io.Reader;

/**
 * @Author:lzq
 * @Discription
 * @Date: Created on 2017/5/26.
 * @Modified By:
 */
public class SendVoiceAmr {
    private static final String JSONFILE = Example.class.getClassLoader().getResource("jsonsource").getPath()+"/";
    /**
     * 本地调用测试
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String appKey = "8luwapkv8t3pl";//替换成您的appkey
        String appSecret = "z0gFndOLga2Q";//替换成匹配上面key的secret

        //wenhai
//        String appKey = "cpj2xarlc60wn";//替换成您的appkey
//        String appSecret = "3uqeGPJV9y";//替换成匹配上面key的secret

        Reader reader = null;
        RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);

//        System.out.println("************************User********************");
//        // 获取 Token 方法
//        TokenResult userGetTokenResult = rongCloud.user.getToken("userId1", "username", "http://www.rongcloud.cn/images/logo.png");
//        System.out.println("getToken:  " + userGetTokenResult.toString());
//
//        // 检查用户在线状态 方法
//        CheckOnlineResult userCheckOnlineResult = rongCloud.user.checkOnline("7083520");
//        System.out.println("checkOnline:  " + userCheckOnlineResult.toString());

        System.out.println("************************Message********************");
        // 发送单聊消息方法（一个用户向另外一个用户发送消息，单条消息最大 128k。每分钟最多发送 6000 条信息，每次发送用户上限为 1000 人，如：一次发送 1000 人时，示为 1000 条消息。）
//        String[] messagePublishPrivateToUserId = {"4700437976","4700299266"};
        String[] messagePublishPrivateToUserId = {"4700299266"};
        String voiceContent = "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";
        VoiceMessage messagePublishPrivateVoiceMessage = new VoiceMessage(voiceContent, "helloExtra", 5L);
        CodeSuccessResult messagePublishPrivateResult = rongCloud.message.publishPrivate(App.SERVER_USERID, messagePublishPrivateToUserId, messagePublishPrivateVoiceMessage, "thisisapush", "{\"pushData\":\"hello\"}", "4", 0, 0, 0, 0);
        System.out.println("publishPrivate:  " + messagePublishPrivateResult.toString());
    }
}
