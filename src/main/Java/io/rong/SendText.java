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
        String appKey = "8luwapkv8t3pl";
        String appSecret = "z0gFndOLga2Q";
        RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);

        String[] messagePublishPrivateToUserId = {"webuser"};
        String toWeb = "hello, for test";
        TxtMessage messagePublishPrivateVoiceMessage = new TxtMessage(toWeb, "helloExtra");
        CodeSuccessResult messagePublishPrivateResult = rongCloud.message.publishPrivate("4700299477",
                messagePublishPrivateToUserId, messagePublishPrivateVoiceMessage, "thisisapush",
                "{\"pushData\":\"hello\"}", "4", 0, 0, 0, 0);
        System.out.println("publishPrivate:  " + messagePublishPrivateResult.toString());
        System.gc();
    }
}
