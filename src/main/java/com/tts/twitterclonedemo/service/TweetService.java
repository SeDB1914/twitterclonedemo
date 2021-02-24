package com.tts.twitterclonedemo.service;

import com.tts.twitterclonedemo.model.Tweet;
import com.tts.twitterclonedemo.model.TweetDisplay;
import com.tts.twitterclonedemo.model.User;

import java.util.List;

public interface TweetService {

    List<TweetDisplay> findAll();
    List<TweetDisplay> findAllByUser(User user);
    List<TweetDisplay> findAllByUsers(List<User> users);
    void save(Tweet tweet);
    List<TweetDisplay> findAllWithTag(String tag);


    void handleTags(Tweet tweet);

    List<TweetDisplay> formatTweets(List<Tweet> tweets);

    List<TweetDisplay> formatTimestamps(List<Tweet> tweets);

    void addTagLinks(List<Tweet> tweets);

    void shortenLinks(List<Tweet> tweets);
}
