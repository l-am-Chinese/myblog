package com.zhs.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 张浩晟
 * @Date: 2021/5/16 14:39
 * Describe:
 */
@Data
@NoArgsConstructor
public class FriendLink {

    private int id;

    /**
     * 博主
     */
    private String blogger;

    /**
     * 博主url
     */
    private String url;

    public FriendLink(String blogger, String url){
        this.blogger = blogger;
        this.url = url;
    }

}
