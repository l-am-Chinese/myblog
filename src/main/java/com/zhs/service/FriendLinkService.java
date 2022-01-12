package com.zhs.service;

import com.zhs.model.FriendLink;
import com.zhs.utils.DataMap;

/**
 * @author: 张浩晟
 * @Date: 2021/5/16 17:08
 * Describe:
 */
public interface FriendLinkService {

    DataMap addFriendLink(FriendLink friendLink);

    DataMap getAllFriendLink();

    DataMap updateFriendLink(FriendLink friendLink, int id);

    DataMap deleteFriendLink(int id);

    DataMap getFriendLink();
}
