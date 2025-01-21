package me.zhenxin.qqbot.event;

import lombok.Getter;
import me.zhenxin.qqbot.entity.Guild;
import me.zhenxin.qqbot.entity.Interaction;

import java.util.EventObject;

/**
 * @author 邱三岁
 * @Email 154259595@qq.com
 * @Description
 * @date 2025/1/21
 */
@Getter
public class InteractionCreateEvent extends EventObject {

    private final Interaction interaction;

    public InteractionCreateEvent(Object source, Interaction interaction) {
        super(source);
        this.interaction = interaction;
    }
}
