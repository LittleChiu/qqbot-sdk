package me.zhenxin.qqbot.entity;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 邱三岁
 * @Email 154259595@qq.com
 * @Description
 * @date 2025/1/21
 */


@Setter
@Getter
public class Interaction {

    // Getters and setters
    @JSONField(name = "id")
    private String id;

    @JSONField(name = "type")
    private int type;

    @JSONField(name = "scene")
    private String scene;

    @JSONField(name = "chat_type")
    private int chatType;

    @JSONField(name = "timestamp")
    private String timestamp;

    @JSONField(name = "guild_id")
    private String guildId;

    @JSONField(name = "channel_id")
    private String channelId;

    @JSONField(name = "user_openid")
    private String userOpenid;

    @JSONField(name = "group_openid")
    private String groupOpenid;

    @JSONField(name = "group_member_openid")
    private String groupMemberOpenid;

    @JSONField(name = "data.resoloved.button_data")
    private String buttonData;

    @JSONField(name = "data.resoloved.button_id")
    private String buttonId;

    @JSONField(name = "data.resoloved.user_id")
    private String userId;

    @JSONField(name = "data.resoloved.feature_id")
    private String featureId;

    @JSONField(name = "data.resoloved.message_id")
    private String messageId;

    @JSONField(name = "version")
    private int version;

}

