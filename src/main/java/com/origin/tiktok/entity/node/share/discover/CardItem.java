package com.origin.tiktok.entity.node.share.discover;
/**
 * host www.tiktok.com
 * path /node/share/discover
 */
import javax.persistence.*;

@Entity
@Table(name = "cardItem")

public class CardItem {
    long id;
    int type;
    String conve;
    String title;
    String subTitle;
    String description;
    String link;
    boolean round;
    String playToken;
    String keyToken;
    ExtraInfo extraInfo;
}
