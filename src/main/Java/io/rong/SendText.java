package io.rong;

import io.rong.messages.TxtMessage;
import io.rong.models.CodeSuccessResult;

/**
 * @Author:lzq
 * @Discription
 * @Date: Created on 2017/6/5.
 * @Modified By:
 */
public class SendText {
    public static void main(String[] args) throws Exception {
        String appKey = "8luwapkv8t3pl";//替换成您的appkey
        String appSecret = "z0gFndOLga2Q";//替换成匹配上面key的secret
        RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);

        String[] messagePublishPrivateToUserId = {"webuser"};
        String toWeb = "hello, webuser, test";
        TxtMessage messagePublishPrivateVoiceMessage = new TxtMessage(toWeb, "helloExtra");
        CodeSuccessResult messagePublishPrivateResult = rongCloud.message.publishPrivate("serverUser", messagePublishPrivateToUserId, messagePublishPrivateVoiceMessage, "thisisapush", "{\"pushData\":\"hello\"}", "4", 0, 0, 0, 0);
        System.out.println("publishPrivate:  " + messagePublishPrivateResult.toString());
    }
}
