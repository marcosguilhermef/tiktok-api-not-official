package com.origin.tiktok.entity.node.share.discover;
/**
 * host www.tiktok.com
 * path /node/share/discover
 */
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "extraInfo")
public class ExtraInfo {
    boolean verified;
    long fans;
    long likes;
    long userId;
    String secUid;;
    int relation;
    int video;

    long following;
    long heart;
    long digg;
}

