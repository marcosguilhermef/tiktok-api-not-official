package com.origin.tiktok.entity.node.share.discover;
/**
 * host www.tiktok.com
 * path /node/share/discover
 */
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "pageState")
public class PageState {
    int regionAppId;
    String os;
    String region;
    String baseURL;
    String appType;
    String fullUrl;
}
