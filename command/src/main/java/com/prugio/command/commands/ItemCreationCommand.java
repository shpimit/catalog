package com.prugio.command.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class ItemCreationCommand {
    private String itemNO;
    private String materialClass;
    private String addUserID;
}

