package com.prugio.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ItemCreationEvent {
    private String itemNO;
    private String materialClass;
    private String addUserID;
}
