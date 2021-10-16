package com.company;

public class SocialFactory implements SocialNetworkFactory{
    @Override
    public Facebook getFacebook() {
        return new News();
    }

    @Override
    public Instagram getInstagram() {
        return new PostPhoto();
    }

    @Override
    public Twitter getTwitter() {
        return new Chat();
    }

    @Override
    public VK getVK() {
        return new Music();
    }
}
