package com.company;

public class Main {

    public static void main(String[] args) {
        SocialNetworkFactory socialNetworkFactory = new SocialFactory();
        Facebook facebook = socialNetworkFactory.getFacebook();
        Instagram instagram = socialNetworkFactory.getInstagram();
        Twitter twitter = socialNetworkFactory.getTwitter();
        VK vk = socialNetworkFactory.getVK();

        System.out.println("Creating action of social network user");
        facebook.readNews();
        instagram.postPhoto();
        twitter.chatting();
        vk.listeningMusic();
    }
}
