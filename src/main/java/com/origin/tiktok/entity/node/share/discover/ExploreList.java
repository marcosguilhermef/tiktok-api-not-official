package com.origin.tiktok.entity.node.share.discover;
/**
 * host www.tiktok.com
 * path /node/share/discover
 */
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exploreList")
public class ExploreList {
    List<CardItem> cardItem;
    int statusCode;
    PageState pageState;
}
