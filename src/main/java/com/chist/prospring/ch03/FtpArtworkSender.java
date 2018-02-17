package com.chist.prospring.ch03;

public class FtpArtworkSender implements ArtworkSender {

    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        //ftp logic here
    }

    @Override
    public String getFriendlyName() {
        return "File transfer protocol";
    }

    @Override
    public String getShortName() {
        return "ftp";
    }
}